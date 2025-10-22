package Tema2.ActividadesBucles;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int factorial = 1;

        System.out.println("Introduce el número entero: ");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos");

        } else {
            for (int i = 1; i <= numero; i++) {
                factorial = factorial * i;
            }

            System.out.println("El facotrial de " + numero + " es: " + factorial);

        }

        sc.close();

    }
}
