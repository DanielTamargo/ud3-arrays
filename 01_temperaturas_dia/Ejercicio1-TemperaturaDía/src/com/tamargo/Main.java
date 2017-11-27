package com.tamargo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //creación array
        int [] temperaturaDia = new int [24];

        System.out.println("Escribe las temperaturas de cada hora del día.");

        //pedida datos y almacenamiento en array
        for (int i = 0; i < temperaturaDia.length; i++) {
            System.out.print("Tempertura hora "+(i+1)+": ");
            temperaturaDia [i] = Integer.parseInt(br.readLine());
        }

        //calculando el máximo y el mínimo y media
        int maximo = -1111; // el 1 me gusta
        int minimo = 1111;
        int media = 0;
        for (int i = 0; i < temperaturaDia.length; i++) {
            if (temperaturaDia[i] > maximo) {
                maximo = temperaturaDia[i];
            }
            if (temperaturaDia[i] < minimo) {
                minimo = temperaturaDia[i];
            }
            media = media + temperaturaDia[i];
        }
        media = media / 24;

        System.out.println("");
        System.out.println("La gráfica es");
        System.out.println("");

        //muestra de la gráfica
        int horas = 0;
        for (int i = 0; i < temperaturaDia.length; i++) {
            int asteriscos = 0;
            horas++;
            System.out.print(horas+": ");
            do {
                asteriscos++;
                System.out.print("*");
            } while (asteriscos < temperaturaDia[i]);
            System.out.print(" "+temperaturaDia[i]);
            if (temperaturaDia[i] == maximo) {
                System.out.print(" --> MAX");
            } else if (temperaturaDia[i] == minimo) {
                System.out.print(" --> MIN");
            }
            System.out.println("");
        }
        System.out.println("Media: "+media);
    }
}
