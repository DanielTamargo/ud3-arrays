package com.tamargo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //tamaño array
        System.out.print("¿Cuántos sois en clase? ");
        int cuantos = Integer.parseInt(br.readLine());
        String[] listaClase = new String[cuantos];

        //pedida nombres
        System.out.println("Escribe los nombres de tus compañeros de clase.");
        for (int i = 0; i < listaClase.length; i++) {
            System.out.print("Nombre: ");
            listaClase[i] = br.readLine();
        }

        //lista
        String valor;
        do {
            System.out.print("Escribe una letra o 'Fin' para acabar: ");
            valor = br.readLine();

            int cantidad = 0;

            System.out.println("La lista de nombres es:");

            if (!valor.equalsIgnoreCase("Fin")) {
                char letra = valor.toUpperCase().charAt(0);
                for (int i = 0; i < listaClase.length; i++) {

                char comprobacion = listaClase[i].toUpperCase().charAt(0);

                if (letra == comprobacion) {
                    System.out.println(listaClase[i]);
                    cantidad++;
                }
                }
            }
            if (cantidad == 0) {
                System.out.println("¡Vaya! No hay nombres con esa letra.");
            }
            System.out.println("");
        } while (!valor.equalsIgnoreCase("Fin"));

    }
}
