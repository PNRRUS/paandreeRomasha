package RestAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class Ex6 {


    @Test
    public void headerRedirectPrint() {
        // Необходимо написать тест, который создает GET-запрос на адрес: https://playground.learnqa.ru/api/long_redirect
        //С этого адреса должен происходить редирект на другой адрес. Наша задача — распечатать адрес, на который редиректит указанные URL.

        Response response = RestAssured
                .given()
                .redirects()
                .follow(false)
                .when()
                .get("https://playground.learnqa.ru/api/long_redirect")
                .andReturn();

//        Response response1 = RestAssured
//                .given()
//                .get("https://playground.learnqa.ru/api/long_redirect")
//                .andReturn();
//        response1.prettyPrint();

        System.out.println(Optional.ofNullable(response.getHeader("location")));
    }
}
