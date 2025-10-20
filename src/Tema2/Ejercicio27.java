package Tema2;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {

        System.out.println("Los 20 primero snúmeros primos son:");

        int contador = 0;
        int numero = 2;

        while (contador < 20) {
            boolean esPrimo = true;

            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println(numero + " ");
                contador++;

            }
            numero ++;
        }
    }
}
