package Tema3.Arrays;

import java.util.Scanner;
import java.util.Random;

public class Buscaminas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int[] tablero = new int[20];
        boolean[] visibles = new boolean[20];


        int minas = 0;
        while (minas < 6) {
            int pos = rand.nextInt(20);
            if (tablero[pos] != -1) {
                tablero[pos] = -1;
                minas++;
            }
        }


        for (int i = 0; i < 20; i++) {
            if (tablero[i] == -1) continue;
            int count = 0;
            if (i > 0 && tablero[i-1] == -1) count++;
            if (i < 19 && tablero[i+1] == -1) count++;
            tablero[i] = count;
        }

        int casillasSeguras = 14;
        int descubiertas = 0;

        System.out.println("¡Bienvenido a Buscaminas!");

        boolean juegoActivo = true;
        while (juegoActivo) {
            System.out.print("Selecciona posición (1-20): ");
            int pos = sc.nextInt() - 1;

            if (tablero[pos] == -1) {
                System.out.println("¡BOOM! Pisaste una mina");
                juegoActivo = false;
            } else {
                if (!visibles[pos]) {
                    visibles[pos] = true;
                    descubiertas++;
                }
                System.out.println("Valor a la posición " + (pos+1) + ": " + tablero[pos]);

                if (descubiertas == casillasSeguras) {
                    System.out.println("¡Ganaste! Has descubierto todas las casillas seguras");
                    juegoActivo = false;
                }
            }
        }
    }
}
