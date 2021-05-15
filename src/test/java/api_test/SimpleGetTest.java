package api_test;
import Testing.TestNgMavenTest;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.testng.Assert;

import java.util.HashMap;

public class SimpleGetTest {
    private static final Logger LOGGER= LogManager.getLogger(SimpleGetTest.class);

    @Test
    public void getAllUsers(){
        //Specify the base URL or EndPoint of the rEst API
        RestAssured.baseURI="https://reqres.in/api/users?page=2";

        //Create an object of the RequestSpecification that you want to send to the server
        //The server is specified by the base URL that we have specified in the above code.
        RequestSpecification httpRequest=RestAssured.given();

        //Make a request to the specified server by specifying method type.
        //This will return response from the server and that will store in response variable.
        Response response=httpRequest.request(Method.GET);
        LOGGER.debug(response);

        //Get the status code in log file
        LOGGER.debug(response.getStatusCode());

        //Get the response body in the log file
        LOGGER.debug(response.getBody().asString());

        //PRINT status code
        System.out.println("Actual status code is "+response.getStatusCode());

        //Validate response status code
        Assert.assertEquals(response.getStatusCode(),200);

        //Print Response body
        System.out.println(response.getBody().prettyPrint());

        //Validate Response body
        //First create json path object from the response
        JsonPath jsonpath =response.jsonPath();
        String r1=jsonpath.getString("data[0].id");
        LOGGER.debug(r1);
        Assert.assertNotNull(jsonpath.getString("data[0]"),"User Record is null");
        LOGGER.debug("<--------First Test Case End--------->");

    }


    @Test
    public void getSingleUser(){

        RestAssured.baseURI="https://reqres.in/api/users";

        RequestSpecification httpRequest=RestAssured.given();

        Response response=httpRequest.request(Method.GET,"/2");

        LOGGER.debug(response.getStatusCode());

        //Validate firstName of the getSingleUser();
        JsonPath jsonpath=response.jsonPath();

        String record=jsonpath.getString("data.first_name");
        LOGGER.debug("expected Single user first name is janet and Actual first name is "+record);
        Assert.assertEquals(record,"Janet");


    }

}
