package Tema3.Arrays;

import java.util.Scanner;
import java.util.Random;

public class BuscaParejas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        String[] animales = {"León","Mandril","Suricata","Facóquero","Elefante", "Tigre","Mono","Jirafa","Cebra","Hipopótamo"};

        String[] tablero = new String[20];
        boolean[] visibles = new boolean[20];


        for (int i = 0; i < 10; i++) {
            int pos1, pos2;
            do { pos1 = rand.nextInt(20); } while (tablero[pos1] != null);
            do { pos2 = rand.nextInt(20); } while (tablero[pos2] != null);
            tablero[pos1] = animales[i];
            tablero[pos2] = animales[i];
        }

        int parejasEncontradas = 0;

        System.out.println("¡Buscar Parejas!");

        while (parejasEncontradas < 10) {
            System.out.print("Elige primera posición (1-20): ");
            int p1 = sc.nextInt() - 1;
            System.out.print("Elige segunda posición (1-20): ");
            int p2 = sc.nextInt() - 1;

            if (p1 == p2) {
                System.out.println("Debes elegir posiciones diferentes.");
                continue;
            }

            System.out.println("Posición " + (p1+1) + ": " + tablero[p1]);
            System.out.println("Posición " + (p2+1) + ": " + tablero[p2]);

            if (tablero[p1].equals(tablero[p2])) {
                System.out.println("¡Pareja encontrada!");
                visibles[p1] = true;
                visibles[p2] = true;
                parejasEncontradas++;
            } else {
                System.out.println("No es pareja.");
            }
            System.out.println();
        }

        System.out.println("¡Felicidades! Has encontrado todas las parejas.");
    }
}
