package seleniumbasics;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APICalls {

    public Response getToolName() {
        return RestAssured.given()
                .log()
                .all()
                .get("https://retargetcommon.free.beeceptor.com/getToolName")
                .then()
                .log().all()
                .extract().response();
    }
}
