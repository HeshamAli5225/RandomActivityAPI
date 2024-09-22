package APITests;

import APIS.getActivityAPI;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class getActivityTests {



    Response response;

    @Test(priority = 1)
    public void validate_status_code(){
        response=getActivityAPI.getActivity();
        Assert.assertEquals(response.statusCode(),200);
    }

    @Test(priority = 2)
    public void validate_response_data(){

        File getSchemaFile = new File("src/test/java/Schema/getActivitySchema.json");
        response.then().assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(getSchemaFile));

    }

}
