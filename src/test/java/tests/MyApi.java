package tests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class MyApi {




    @Test
    public void test1(){
        Response response = RestAssured.get("http://localhost:3000/profile");

        int status = response.getStatusCode();
        System.out.println("Status is -> " + status);

        // this is assertion too
        RestAssured.when().get("http://localhost:3000/profile").then().statusCode(200);
        //Regular assertion
        Assert.assertEquals(status,200);

        String jsonRes = response.asString();
        System.out.println(jsonRes);
    }
    public void test2(){
        RestAssured.when().get("http://localhost:3000/comments").then().statusCode(200);
    }

    public void test3(){
        RestAssured.when().get("http://localhost:3000/posts").then().statusCode(200);
    }
}
