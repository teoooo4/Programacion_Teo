package Tema2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        double num1 = in.nextDouble();

        System.out.println("Introduce el segundo número: ");
        double num2 = in.nextDouble();

        System.out.println("Introduce el tercer número: ");
        double num3 = in.nextDouble();

        if (num1 <= num2 && num2 <= num3) {
            System.out.println("Los números están ordenador de menor a mayor.");
        } else {
            System.out.println("Los números NO están ordenador d mayor a menor.");
        }

        in.close();

    }
}