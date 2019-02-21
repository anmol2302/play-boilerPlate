package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.User;
import play.libs.F;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;
import service.UserManager;
import util.Util;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Filter;

public class UserController extends Controller {
    UserManager userManager= new UserManager();

    public F.Promise<Result> addUser(){
        JsonNode jsonNode = request().body().asJson();
        if (jsonNode == null){
            return F.Promise.<Result>pure(Results.badRequest(Util.createResponse(
                    "Expecting Json data", false)));
        } else{
            User user = userManager.addUser(jsonNode);
                if(user.getUserName()=="Not Created"){
                    return F.Promise.<Result>pure(Results.notFound(Util.createResponse("Couldn't Be Created",false)));
                }
            return F.Promise.<Result>pure(Results.created(Util.createResp(user,true)));
        }
    }

    public  F.Promise<Result> allUsers(){
        List<User> users = userManager.allUsers();
        if(users.size()== 0){
            return F.Promise.<Result>pure(Results.notFound(Util.createResponse("No Users Present",false)));
        }
        List<ObjectNode> objectNodes = new ArrayList<>();
            for (User user : users) {
                objectNodes.add(Util.createResp(user, true));
            }
        return F.Promise.<Result>pure(Results.created(objectNodes.toString()));
    }


    public F.Promise<Result> getUser(String id){
        User user = userManager.getUser(id);
        if(user.getUserId() == "xxx"){
            return F.Promise.<Result>pure(Results.notFound(Util.createResponse("No User Present with this id",false)));
        }
        return F.Promise.<Result>pure(Results.created(Util.createResp(user,true)));

    }

    public F.Promise<Result> deleteUser(String id){
        String response = userManager.deleteUser(id);
        if( response =="User Not Found"){
            return F.Promise.<Result>pure(Results.notFound(Util.createResponse(response, false)));
        }else {
            return F.Promise.<Result>pure(Results.ok(Util.createResponse(response, true)));
        }
    }

    public F.Promise<Result> updateUser(){
        JsonNode incomingNode = request().body().asJson();
        User user = null;
        if (incomingNode == null){
            return F.Promise.<Result>pure(Results.badRequest(Util.createResponse(
                    "Expecting Json data", false)));
        } else {
            user= userManager.updateUser(incomingNode);
            if(user.getUserId()=="xxx"){
                return F.Promise.<Result>pure(Results.notFound(Util.createResponse(user.getUserName(), false)));
            }else{
                return F.Promise.<Result>pure(Results.ok(Util.createResponse(user.getUserName(), true)));
            }
        }
    }

    public F.Promise<Result> searchUser(){
        JsonNode jsonNode = request().body().asJson();
        if (null == jsonNode){
            return F.Promise.<Result>pure(Results.badRequest(Util.createResponse(
                    "Expecting Json data", false)));
        } else{
            if(jsonNode.has("term")){
                List<User> users = userManager.search(jsonNode);
                List<ObjectNode> objectNodes = new ArrayList<>();
                for (User user : users) {
                    objectNodes.add(Util.createResp(user, true));
                }
                return F.Promise.<Result>pure(Results.ok(objectNodes.toString()));

            }else{
                return F.Promise.<Result>pure(Results.badRequest(Util.createResponse(
                        "Expecting A search Term", false)));
            }
        }

    }
}
