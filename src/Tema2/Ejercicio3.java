package Tema2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Introduce la base del triángulo: ");
        double base = in.nextDouble();

        System.out.println("Introduce la altura del triángulo: ");
        double altura = in.nextDouble();

        double superficie = (base * altura) / 2;

        System.out.println("La superficie del triángulo es: " + superficie);

        in.close();
    }
}