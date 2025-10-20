package Tema2;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {

        int suma = 0;
        int i = 2;

        while (i <= 1000) {
            suma = suma + i;
            i = i + 2;
        }

        System.out.println("La suma de todos los números pares entre 1 y 1000 es: " + suma);
    }
}
