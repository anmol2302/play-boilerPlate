package controllers;


import com.fasterxml.jackson.databind.JsonNode;
import play.libs.F;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Results;
import scala.collection.immutable.List;

import java.util.Arrays;

public class HomeController extends Controller {

    public Result index(){
            return Results.ok("Cassandra Connected");
    }
    public  Result showDemo(){
        return ok("hello worlds");
    }
    public Result handelReq(){
        System.out.println("the proper req"+request());
         return ok("got request");
    }

    public static Result handelDef(String email, String version, String cod, List<Integer> arr){


        if(version.equalsIgnoreCase("1")){
            return ok("the email is "+email+"default version code is"+version+"the code is "+cod+"array got"+ Arrays.asList(arr.toString()));
        }
        return ok("the email is"+email+"the version is"+version+"the code is "+cod+"array got"+ Arrays.asList(arr.toString()));
    }

}
