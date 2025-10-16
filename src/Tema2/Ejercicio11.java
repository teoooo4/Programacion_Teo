package Tema2;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Introduce el primer número entero: ");
        double num1 = in.nextDouble();

        System.out.println("Introduce el segundo número netero: ");
        double num2 = in.nextDouble();

        System.out.println("Introduce el tercer número entero: ");
        double num3 = in.nextDouble();

        if ((num2 == num1 + 1 && num3 == num2) || (num2 == num1 - 1 && num3 == num2 - 1)) {
          System.out.println("Los números son consecutivos.");
        } else {
            System.out.println("Los números NO son consecutivos.");
        }

        in.close();

    }
}
