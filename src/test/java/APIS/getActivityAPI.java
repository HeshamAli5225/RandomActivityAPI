package APIS;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getActivityAPI {
    public static String baseUrl="https://www.boredapi.com/api/activity";

    public static Response getActivity(){
        return RestAssured.given().baseUri(baseUrl).when().get();
    }
}
