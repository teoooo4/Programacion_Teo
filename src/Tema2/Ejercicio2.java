package Tema2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        System.out.println("Introduce la base del rectángulo: ");
        double base = in.nextDouble();

        System.out.println("Introduce la altura del rectángulo: ");
        double altura = in.nextDouble();

        double superficie = base * altura;

        double perimetro = 2 * (base + altura);

        System.out.println("La superficie del rectángulo es: " + superficie);
        System.out.println("El perimetro del rectángulo es: " + perimetro);

        in.close();
    }
}
