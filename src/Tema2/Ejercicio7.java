package Tema2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        double num1 = in.nextDouble();

        System.out.println("Introduce el segundo número: ");
        double num2 = in.nextDouble();

        double resultado;

        if (num1 > num2) {
            resultado = num1 - num2;
            System.out.println("El primero número es mayor.");
        } else if (num2 > num1) {
            resultado = num2 - num1;
            System.out.println("El segundo número es mayor.");
        } else {
            resultado = 0;
            System.out.println("Los dos números son iguales.");
        }

        System.out.println("El resultado de la resta es: " + resultado);

        in.close();

    }
}