package RestAssured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Optional;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import io.qameta.allure.*;
import org.junit.jupiter.api.Test;


@Epic("API Тестирование PetShop")
@Feature("Создание питомцев в магазине")
public class RestAssuredPOSTJsonFile {

        @Test
        @Story("Создание нового питомца из json файла")
        @Description("Тест проверяет успешное создание питомца через API")
        @Severity(SeverityLevel.CRITICAL)

        public void testPostWithJsonFromFile() {
            // Указываем файл с JSON телом
            File jsonFile = new File("src/test/resources/requestMS.json");

                   given()
                    .baseUri("https://petstore.swagger.io")
                    .contentType(ContentType.JSON)
                    .body(jsonFile)
                    .when()
                    .post("/v2/pet")
                    .then()
                    .statusCode(200)
                    .body("name", equalTo("Molson2")); // Проверяем ожидаемый результат

            JsonPath response = RestAssured
                    .given()
                    .get("https://petstore.swagger.io/v2/pet/100503")
                    .jsonPath();

            response.prettyPrint();
            String petname = response.get("name");
            System.out.println("Имя питомца:" + petname);
            assertEquals("Такого питомца нет в магазине", "Molson2",petname);
        }
        @Test
        @Story("Проверка несуществующего питомца из json файла")
        @Description("Тест проверяет отсутствие питомца через API")
        @Severity(SeverityLevel.NORMAL)
        public void testPostWithJsonFromFile1() {
            // Указываем файл с JSON телом
            File jsonFile = new File("src/test/resources/molson.json");

            given()
                    .baseUri("https://petstore.swagger.io")
                    .contentType(ContentType.JSON)
                    .body(jsonFile)
                    .when()
                    .post("/v2/pet")
                    .then()
                    .statusCode(200)
                    .body("name", equalTo("Molson")); // Проверяем ожидаемый результат

            JsonPath response = RestAssured
                    .given()
                    .get("https://petstore.swagger.io/v2/pet/100500")
                    .jsonPath();

            response.prettyPrint();
            String petname = response.get("name");
            System.out.println("Имя питомца:" + petname);
            assertEquals("Такого питомца нет в магазине", "Molson",petname);
        }
    }

