package com.alura.conversormoneda.metodos;

import com.alura.conversormoneda.modelos.MonedaExchange;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionApi {

    private final String tipoMonedaA;
    private final String tipoMonedaB;
    private final String valoraConvertir;

    public ConexionApi(String tipoMonedaA, String tipoMonedaB, String valoraConvertir) {
        this.tipoMonedaA = tipoMonedaA;
        this.tipoMonedaB = tipoMonedaB;
        this.valoraConvertir = valoraConvertir;
    }

    public void ConectarConExchange()throws IOException, InterruptedException {
            // Creando conexión con API ExChange
            String direccion = "https://v6.exchangerate-api.com/v6/98deeb55608ed5302ac54b30/pair/"+tipoMonedaA+"/"+
                    tipoMonedaB+"/"+valoraConvertir;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Guardando json
            String json = response.body();

            //System.out.println(json);

            // Manejando Datos del tipo Json a Gson
            Gson gson = new Gson();

            MonedaExchange miMonedaExchange = gson.fromJson(json,MonedaExchange.class);

            System.out.println(miMonedaExchange);

    }
}
