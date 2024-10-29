package com.alura.conversormoneda.principal;

import com.alura.conversormoneda.modelos.MonedaExchange;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Creando conexión con API ExChange
        String direccion = "https://v6.exchangerate-api.com/v6/98deeb55608ed5302ac54b30/pair/USD/COP";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        System.out.println(json);

        // Manejando Datos del tipo Json a Gson
        Gson gson = new Gson();

        MonedaExchange miMonedaExchange = gson.fromJson(json,MonedaExchange.class);

        System.out.println(miMonedaExchange);
    }
}