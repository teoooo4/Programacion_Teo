package Tema2.ActividadesCondicionales;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Escribe el numero: ");
        int numero = in.nextInt();

        if (numero > 0) {
            System.out.println("El numero es positivo");

        } else if (numero < 0) {
            System.out.println("El numero es negativo");

        } else if (numero == 0) {
            System.out.println("El numero es zero");
        }
    }
}
