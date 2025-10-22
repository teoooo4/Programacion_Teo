package Tema2.ActividadesBucles;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int suma = 0;
        int contador = 0;

        System.out.println("Introduce un número positivo:");
        numero = sc.nextInt();

        while (numero >= 0) {
            suma = suma + contador;
            contador++;

            System.out.println("Introduce otro número:");
            numero = sc.nextInt();
        }

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media de los números introducidos es: " + media);

        } else {
            System.out.println("No se introdujeron números positivos");
        }

        sc.close();

    }
}
