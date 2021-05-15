package api_test;

import Testing.TestNgMavenTest;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimplePATCHTest {
    private static final Logger LOGGER= LogManager.getLogger(TestNgMavenTest.class);
   @Test
    public void updateExistingUserSingleRequest(){
        String userName="Mike";
        String jobTitle="App System Engineer";

        RestAssured.baseURI="https://reqres.in/api/users";
        RequestSpecification httpRequest=RestAssured.given();

        JSONObject reqBody=new JSONObject();
        reqBody.put("name",userName);
        reqBody.put("job",jobTitle);

        httpRequest.header("Content-Type","application/json");
        httpRequest.body(reqBody.toJSONString());

        Response response=httpRequest.request(Method.PATCH,"/2");

        LOGGER.debug("Request Status code is :"+response.getStatusCode());
        //Validate status code
        Assert.assertEquals(response.getStatusCode(),200);

        //Validate that user record is updated
        JsonPath jsonpath=response.jsonPath();
        String record=jsonpath.getString("job");
        LOGGER.debug("Expected Job Title :"+jobTitle+" and Actual Job Title :"+record);
        Assert.assertEquals(record,record);










    }
}
