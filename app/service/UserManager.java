package service;

import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.uuid.Generators;
import dbconnector.CassandraConnector;
import models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserManager {
    public User addUser(JsonNode user) {
        User userTest = null;
        UUID uuid = Generators.randomBasedGenerator().generate();
        if(user.has("userName")){
            userTest = new User( user.get("userName").toString().replace("\"",""),uuid.toString());
            String query ="INSERT INTO user_data.user (userid,username) VALUES ('"+userTest.getUserId()+"','"+userTest.getUserName().replace("\"","")+"')";
            try {
                CassandraConnector.session.execute(query);
            }catch (Exception e){
                e.printStackTrace();
                return new User("Not created","xxx");
            }
        }
        return userTest;
    }

    public List<User> allUsers() {
        String query ="SELECT * from user_data.user";
        List<User> users = new ArrayList<>();
        try {

            ResultSet resultSet = CassandraConnector.session.execute(query);
            if (! resultSet.isExhausted()) {
                List<Row> rows = resultSet.all();
                for (Row row :rows) {
                    users.add(new User(row.getString("username").replace("\"",""),row.getString("userid")));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList<User>();
        }finally {
            return users;
        }
    }

    public User getUser(String id){
        User user= null;
        try {
            ResultSet resultSet = CassandraConnector.session.execute("Select * from user_data.user where userid='"+id.replace("\"","")+"'");
            if (! resultSet.isExhausted()) {
                Row row = resultSet.one();
                user = new User(row.getString("username").replace("\"",""),row.getString("userid"));
            }
        }catch (Exception e){
            e.printStackTrace();
            return new User("User not found", "xxx");
        }finally {
            return user;
        }
    }

    public String deleteUser(String id){
        Boolean response =false;
        try {
            ResultSet resultSet = CassandraConnector.session.execute("delete from user_data.user where userid='"+id.replace("\"","")+"' if exists");
            Row row = resultSet.one();
            response= row.getBool("[applied]");
        }catch (Exception e){
            e.printStackTrace();
            return "Internal Server Error";
        }finally {
            if(response){
                return "User Deleted";
            }else{
                return "User Not Found";
            }
        }
    }

    public User updateUser(JsonNode incomingNode){
        Boolean response =false;
        String query ="";
        if(incomingNode.has("userId")){
            incomingNode.get("userId").toString();
             query="UPDATE user_data.user SET username = '"+incomingNode.get("userName").toString().replace("\"","")+"'  WHERE userid = '"+incomingNode.get("userId").toString().replace("\"","")+"' IF EXISTS";
            try {
                ResultSet resultSet = CassandraConnector.session.execute(query);
                Row row = resultSet.one();
                response= row.getBool("[applied]");
            }catch (Exception e){
                e.printStackTrace();
                return new User("Couldn't Internal Server Error","xxx");
            }finally {
                if(response){
                    return new User("User Updated","true");
                }else{
                    return new User("User Not Updated","xxx");
                }
            }
        } else {
            return new User("Please provide userId","xxx");
        }
    }

    public List<User> search(JsonNode incomingNode){
        List<User> tempUsers=allUsers();
        List<User> searchedUser = new ArrayList<>();
        int limit = 0;
        int offset = 0;
        if(incomingNode.has("limit")){
            limit = Integer.parseInt(incomingNode.get("limit").toString());
        }
        if(incomingNode.has("offset")){
            offset = Integer.parseInt(incomingNode.get("offset").toString());
        }
        String searchTerm=incomingNode.get("term").toString().toLowerCase().replace("\"","");
        for (User user:tempUsers) {
            if(user.getUserName().toLowerCase().matches("(.*)"+searchTerm+"(.*)")){
                searchedUser.add(user);
            }
        }
        if(limit>0){
            int maxOffset = searchedUser.size()/limit;
            if(offset>0 && offset<maxOffset){
                    return searchedUser.subList(limit*offset,limit*(offset+1));
                }
            return searchedUser.subList(0,limit);
        }else{
            return  searchedUser;
        }
    }

}

