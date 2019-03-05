package controllers;


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
        F.Promise<Integer> promiseOfInt = F.Promise.promise(() -> intensiveComputation());
        return promiseOfInt.map((Integer i) ->ok ("hello got "+i));
    }

    private int intensiveComputation() {

        return 1;
    }



}
