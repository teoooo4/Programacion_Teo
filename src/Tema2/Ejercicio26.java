package Tema2;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");

        int numero = sc.nextInt();
        boolean esPrimo = true;

        if (numero < 2) {
            esPrimo = false;

        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println(numero + " es un número primo");
        } else {
            System.out.println(numero + " no es un número primo");
        }

        sc.close();

    }
}
