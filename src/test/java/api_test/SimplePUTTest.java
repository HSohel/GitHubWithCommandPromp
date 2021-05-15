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

public class SimplePUTTest {
    private static final Logger LOGGER= LogManager.getLogger(TestNgMavenTest.class);
   @Test
    public void updateExistingUserRecord(){
        String userName="Peter";
        String jobTitle="Software Engineer";
        RestAssured.baseURI="https://reqres.in/api/users";

        RequestSpecification httpRequest=RestAssured.given();
        JSONObject reqBody=new JSONObject();
        reqBody.put("name",userName);
        reqBody.put("job",jobTitle);

        httpRequest.header("Content-Type","application/json");
        httpRequest.body(reqBody.toJSONString());

        Response response=httpRequest.request(Method.PUT,"/2");
        LOGGER.debug("Request status code is "+ response.getStatusCode());
        Assert.assertEquals(response.getStatusCode(),200);

        JsonPath jsonPath=response.jsonPath();
        String record=jsonPath.getString("name");
        LOGGER.debug("Expected :"+userName+" Actual :"+record);
        Assert.assertEquals(record,userName);




    }

}
