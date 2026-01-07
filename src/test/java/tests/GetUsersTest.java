package tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class GetUsersTest {

    @Test
    public void getUsersList() {

        given()
            .baseUri("https://dummyjson.com")
            .header("Accept", "application/json")
        .when()
            .get("/users")
        .then()
            .statusCode(200)
            .body("users.size()", greaterThan(0))
            .body("limit", greaterThan(0));
    }
}
