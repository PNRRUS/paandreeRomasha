package RestAssured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import static org.hamcrest.Matchers.equalTo;

public class HTTPTrainingRestAssured {

        @Test
        public void testGetUser () {
            given()
                    .baseUri("https://petstore.swagger.io/v2")
                    .when()
                    .get("/pet/100503")
                    .then()
                    .statusCode(200)
                    .body("name", equalTo("Molson1"));
        Response response = RestAssured
                .get("https://petstore.swagger.io/v2/pet/100503")
                .andReturn();
        response.prettyPrint();

System.out.println(response.toString());
        }
    }

