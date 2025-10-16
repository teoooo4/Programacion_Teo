package Tema2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Introduce el lado del cuadrado: ");
        double lado = in.nextDouble();

        double superficie = lado * lado;

        double perimetro = 4 * lado;

        System.out.println("La superficie del cuadrado es: " + superficie);
        System.out.println("El perimetro del cuadrado es: " + perimetro);

        in.close();

    }
}
