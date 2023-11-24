package org.practica4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Metodos {

    // Método que se utiliza en los menus para la obtención de la opción. Básicamente,
    // para curarme en salud cuando pregunto por el dato, en principio no tiene fallo.
    public static int obtenerOpcion() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
            return -1; // Si ocurre una excepción, retornamos un valor que indicará un error
        }
    }
}
