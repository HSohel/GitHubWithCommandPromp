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
import org.junit.Test;
import org.testng.Assert;

public class SimplePostTest {
    private static final Logger LOGGER= LogManager.getLogger(TestNgMavenTest.class);
    @Test
    public void createNewUser(){
        String userName="Adam";
        String jobRole="Automation Tester";

        RestAssured.baseURI="https://reqres.in/api/users";
        RequestSpecification httpRequest=RestAssured.given();

        JSONObject reqBody=new JSONObject();

        reqBody.put("name",userName);
        reqBody.put("job",jobRole);

        httpRequest.header("Content-Type","application/JSON");
        httpRequest.body(reqBody.toJSONString());

        Response response=httpRequest.request(Method.POST);

        LOGGER.debug(" Request Status code is :"+response.getStatusCode());
        Assert.assertEquals(response.getStatusCode(),201);

        JsonPath jsonpath=response.jsonPath();
        String record=jsonpath.getString("name");
        LOGGER.debug("Expected record is :"+record +" Actual record is :"+userName);
        Assert.assertEquals(record,userName);

    }

}
