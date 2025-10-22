package Tema2.ActividadesCondicionales;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Introduce el número de personas: ");
        int personas = in.nextInt();

        System.out.print("Introduce el número de días: ");
        int dias = in.nextInt();

        double tarifaNoche = 15.0;
        double precio = personas * dias * tarifaNoche;

        if (personas > 5 && dias >= 7) {
            precio = precio * 0.75;
        }

        System.out.printf("El precio total de la estancia es: %.2f €%n", precio);

        in.close();
    }
}

