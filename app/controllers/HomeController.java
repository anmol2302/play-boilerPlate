package controllers;


import com.fasterxml.jackson.databind.JsonNode;
import play.libs.F;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;

public class HomeController extends Controller {

    public Result index(){
            return Results.ok("Cassandra Connected");
    }
    public  Result showDemo(){
        return ok("hello worlds");
    }
    public F.Promise<Result> handelReq(){
        F.Promise<Integer>  pr=intensiveComputation();
        F.Promise<Result> promiseOfInt = pr.map((Integer i) -> ok("got "+i));
        return promiseOfInt;
    }

    private F.Promise<Integer> intensiveComputation() {
        return F.Promise.pure(1);
    }

    public F.Promise<Result> handelJson(){

        JsonNode json=request().body().asJson();

        if(json.findPath("name")!=null){

            F.Promise<String> promiseOfname = nameHandeler(json.findPath("name").textValue());
            return promiseOfname.map((String s)->ok("my name changed to "+s));

        }
        else{
            return F.Promise.<Result>pure(badRequest("missing parameter [name]"));
        }

    }

    private F.Promise<String> nameHandeler(String name) {


        StringBuilder sb=new StringBuilder();
        sb.append(name);
        sb.append(" ");
        sb.append(name);
        return F.Promise.<String>pure(sb.toString());


    }


}
