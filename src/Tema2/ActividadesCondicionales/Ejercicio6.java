package Tema2.ActividadesCondicionales;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        double numero = in.nextDouble();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0 ) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        in.close();

    }
}
