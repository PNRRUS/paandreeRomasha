package RestAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class Ex4 {

    @Test
    public void testGET(){
        Map<String,String> parameters = new HashMap();
        parameters.put("name","don Pablo");
//        parameters.put("name","don Pablo1");
        Response response = RestAssured
//                .get("https://playground.learnqa.ru/api/get_text")
//              .get("https://playground.learnqa.ru/api/hello?name=Pavel")
                .given()
                .queryParams(parameters)
                .get("https://playground.learnqa.ru/api/hello")
                .andReturn();
        response.prettyPrint();

        JsonPath responseJson = RestAssured
                .given()
                .queryParams(parameters)
                .get("https://playground.learnqa.ru/api/hello")
                .jsonPath();

        System.out.println(Optional.ofNullable(responseJson.get("answer")));
    }
}
