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
        F.Promise<Integer>  pr=intensiveComputation();
        F.Promise<Result> promiseOfInt = pr.map((Integer i) -> ok("got "+i));
        return promiseOfInt;
    }

    private F.Promise<Integer> intensiveComputation() {
        return F.Promise.pure(1);
    }

}
