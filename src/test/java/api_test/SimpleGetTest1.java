package api_test;

import Testing.TestNgMavenTest;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class SimpleGetTest1 {

    private static final Logger LOGGER= LogManager.getLogger(SimpleGetTest1.class);
    Response response;

    @Test
    public void getAllUsers(){
        RestAssured.baseURI="https://reqres.in/api/";
        RequestSpecification httpRequest=RestAssured.given();
        response=httpRequest.queryParam("page","2").request(Method.GET, "/users/");

        String responseBody=response.getBody().asString();
        LOGGER.debug("Response Body is: "+responseBody);

        int StrStatusCode=response.getStatusCode();

        Assert.assertEquals(StrStatusCode,200);

/*      JsonPath jsonPath=response.jsonPath();
        List<String>list=jsonPath.get("data.email");
        LOGGER.debug(list);
        Assert.assertTrue(list.contains("michael.lawson@reqres.in"));
        LOGGER.debug("<-----getAllUsers--- Test case Ends here");*/

        String strJsonString=response.asString();
        List<String>list=JsonPath.from(strJsonString).get("email");
        LOGGER.debug(list);
        LOGGER.debug("<-----getAllUsers--- Test case Ends here");

    }


    @Test
    public void getSingleUser(){
        RestAssured.baseURI="https://reqres.in/api/users/";
        RequestSpecification httpRequest=RestAssured.given();
        response=httpRequest.request(Method.GET, "2");
        LOGGER.debug(response.getBody().asString());
        Assert.assertEquals(response.getStatusCode(),200);

        JsonPath jsonPath=response.jsonPath();
        String email=jsonPath.getString("data.email");
        Assert.assertTrue(email.equalsIgnoreCase("janet.weaver@reqres.in"));
        LOGGER.debug(email);

    }
}
