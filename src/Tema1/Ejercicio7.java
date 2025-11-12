package Tema1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opuesto;

        System.out.println("Introduce el numero de la cara de un dado (1 al 6): ");
        int numero = sc.nextInt();

        if (numero > 6 || numero < 1) {
            System.out.println("Numero incorrecto");

        } else {
            opuesto = numero - 7;
            //los resultados salen bien pero en negativo
            System.out.println("La cara opuesta es: " + opuesto);
        }
    }
}
