package Tema2;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Introduce 0 (cuadrado), 1 (rectángulo) o 2 (triángulo): ");
        int opcion = in.nextInt();

        switch (opcion) {
            case 0:
                System.out.print("Introduce el lado del cuadrado: ");
                double lado = in.nextDouble();
                double superficieC = lado * lado;
                double perimetroC = 4 * lado;
                System.out.printf("Superficie: %.2f%nPerímetro: %.2f%n", superficieC, perimetroC);
                break;

            case 1:
                System.out.print("Introduce la base del rectángulo: ");
                double baseR = in.nextDouble();
                System.out.print("Introduce la altura del rectángulo: ");
                double alturaR = in.nextDouble();
                double superficieR = baseR * alturaR;
                double perimetroR = 2 * (baseR + alturaR);
                System.out.printf("Superficie: %.2f%nPerímetro: %.2f%n", superficieR, perimetroR);
                break;

            case 2:
                System.out.print("Introduce la base del triángulo: ");
                double baseT = in.nextDouble();
                System.out.print("Introduce la altura del triángulo: ");
                double alturaT = in.nextDouble();
                double superficieT = (baseT * alturaT) / 2.0;
                System.out.printf("Superficie: %.2f%n", superficieT);
                break;

            default:
                System.out.println("Error: opción no válida.");
                break;
        }

        in.close();
    }
}

