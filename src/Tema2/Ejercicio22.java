package Tema2;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int contador = 0;

        System.out.println("Introduce un número entero:");
        numero = sc.nextInt();

        if (numero == 0) {
            contador = 1;
        } else {
            if (numero < 0) {
                numero = -numero;
            }

            while (numero > 0) {
                numero = numero / 10;
                contador++;
            }
        }

        System.out.println("El número tiene " + contador + "cifras");

        sc.close();
    }
}
