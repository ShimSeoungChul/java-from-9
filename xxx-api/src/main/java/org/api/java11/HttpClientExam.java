package org.api.java11;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientExam {
    public static void main(String[] args) throws Exception {
        var client = HttpClient.newHttpClient();

        var request = HttpRequest.newBuilder(URI.create("https://postman-echo.com/get"))
                .GET()
                .build();

        // send는 HTTP 요청을 동기적으로 처리
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        printlnWithThread(response.statusCode());
        printlnWithThread(response.body());

        // sendAsync는 HTTP 요청을 비동기적으로 처리
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenAccept((asyncResponse) -> {
                    printlnWithThread(asyncResponse.statusCode());
                    printlnWithThread(asyncResponse.body());
                });

        client.close();
    }

    private static void printlnWithThread(Object msg) {
        System.out.printf("%s %s\n", Thread.currentThread().getName(), msg);
    }
}
