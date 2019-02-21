package dbconnector;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class CassandraConnector {

    public static Session session;

    public static void  clusterBuilder(){
        Cluster cluster = null;
        try{
            cluster = Cluster.builder()
                    .addContactPoint("127.0.0.1").build();
            session = cluster.connect();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(null == cluster){
                cluster.close();
            }
        }
        session.execute("select release_version from system.local");
        String query="CREATE KEYSPACE IF NOT EXISTS user_data WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 1};";
        session.execute(query);
        query="Use user_data";
        session.execute(query);
        query= "Create Table IF NOT EXISTS user (userid text Primary Key, username text);";
        session.execute(query);
        System.out.println("Cassandra Connected");
    }
}
