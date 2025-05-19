package HTTPTraining;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HTTPTraining {

    public static void main(String[] Args) throws IOException, InterruptedException {


//        HttpClient client1 = HttpClient.newHttpClient();
//        HttpRequest request1 = HttpRequest.newBuilder()
//                .uri(URI.create("https://petstore.swagger.io/v2/pet"))
//                .headers("Content-Type", "application/json;charset=UTF-8")
//                .POST(HttpRequest.BodyPublishers.ofString("{\"id\":100501,\"category\":{\"id\":100500,\"name\":\"Molson1\"},\"name\":\"Molson1\",\"photoUrls\":[\"string\"],\"tags\":[{\"id\":100500,\"name\":\"Molson1\"}],\"status\":\"available\"}"))
//                .build();
//        HttpResponse<String> response1 = client1.send(request1, HttpResponse.BodyHandlers.ofString());
//
//        Path filePath = Paths.get("response.json");
//        HttpResponse<Path> response2 = client1.send(request1, HttpResponse.BodyHandlers.ofFile(filePath));

        HttpClient client5 = HttpClient.newHttpClient();
        HttpRequest request5 = HttpRequest.newBuilder()
                .uri(URI.create("https://petstore.swagger.io/v2/pet"))
                .headers("Content-Type", "application/json;charset=UTF-8")
                .POST(HttpRequest.BodyPublishers.ofFile(Paths.get("requestMS.json")))
                .build();
        HttpResponse<String> response5 = client5.send(request5, HttpResponse.BodyHandlers.ofString());
        System.out.println(response5.statusCode());
        System.out.println(response5.body());

//        System.out.println(response1.statusCode());
//        System.out.println(response1.body());
//        System.out.println(response1);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
             .uri(URI.create("https://petstore.swagger.io/v2/pet/100501"))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());
        System.out.println(response.body());




    }

}
