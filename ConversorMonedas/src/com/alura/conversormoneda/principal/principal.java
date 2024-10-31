package com.alura.conversormoneda.principal;

import com.alura.conversormoneda.metodos.ConexionApi;
import com.alura.conversormoneda.metodos.Menu;

import java.io.IOException;
public class principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        Menu miMenu = new Menu();
        miMenu.opcionesMenu();

        ConexionApi miconexionApi = new ConexionApi(miMenu.opciones.get(0),miMenu.opciones.get(1),miMenu.opciones.get(2));

        miconexionApi.ConectarConExchange();
    }
}