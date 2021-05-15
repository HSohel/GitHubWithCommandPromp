package api_test;


import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import io.restassured.response.Response;
import org.testng.annotations.Test;


public class SimplePostTest1 {
    private static final Logger LOGGER= LogManager.getLogger(SimplePostTest1.class);

    @Test
    public void createUser(){
        RestAssured.baseURI="https://reqres.in/api/users/2";
        RequestSpecification httpRequest=RestAssured.given();

        JSONObject requestBody=new JSONObject();

        requestBody.put("email","abcd1234@yahoo.com");
        requestBody.put("first_name","Donald");
        requestBody.put("last_name","Trump");


        httpRequest.header("Content-Type","Application/JSON");
        httpRequest.body(requestBody.toJSONString());

        Response response=httpRequest.request(Method.POST);

        String strResponseBody=response.asString();
        LOGGER.debug(strResponseBody);
        LOGGER.debug(response.getStatusCode());
        JsonPath jsonPath=response.jsonPath();
        String expectedString=jsonPath.getString("email");
        LOGGER.debug(expectedString);






    }





}
