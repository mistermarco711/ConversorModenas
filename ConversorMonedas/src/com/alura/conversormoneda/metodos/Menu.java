package com.alura.conversormoneda.metodos;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public ArrayList<String> opciones;
    private String valor;

    public void opcionesMenu() {
        // Creando opciones de pares para conversión de moneda
        opciones = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        // Imprimiendo menú para el usuario
        System.out.println("""
                Seleccione una opción de conversión
                1. Peso colombiano ==> dollar
                2. Dollar ==>  peso colombiano
                3. Peso argentino ==>  peso colombiano
                4. Peso colombiano ==>  peso Argentino
                5. Peso chileno ==>  peso mexicano
                6. Peso mexicano ==>  peso chileno
                """);
        // Leyendo dato ingresado
        valor = scanner.nextLine();
        interpretarDato();

        System.out.println("Ingrese el valor a convertir");
        valor = scanner.nextLine();
        opciones.add(valor);
    }
    private void interpretarDato(){

        switch (valor) {
            case "1" -> {
                opciones.add("COP");
                opciones.add("USD");
            }
            case "2" -> {
                opciones.add("USD");
                opciones.add("COP");
            }
            case "3" -> {
                opciones.add("ARS");
                opciones.add("COP");
            }
            case "4" -> {
                opciones.add("COP");
                opciones.add("ARS");
            }
            case "5" -> {
                opciones.add("CLP");
                opciones.add("MXN");
            }
            case "6" -> {
                opciones.add("MXN");
                opciones.add("CLP");
            }
            default -> System.out.println("Seleccione una opción válida");
        }
    }

}
