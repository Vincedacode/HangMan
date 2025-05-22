package Hang_Man;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

public class WordProvider {
    private static final String API_URL = "https://random-word-api.herokuapp.com/word?number=1";
    private HttpClient httpClient;

    public WordProvider() {
        this.httpClient = HttpClient.newHttpClient();
    }

    public String getRandomWord() {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .GET()
                .build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();


            if (body.startsWith("[") && body.endsWith("]")) {
                body = body.substring(1, body.length() - 1);
            }
            body = body.replaceAll("\"", "");

            return body;
        } catch (IOException | InterruptedException e) {
            System.out.println("Connect to internet!");
            return "default";
        }
    }
}

