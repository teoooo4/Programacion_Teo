package Tema2.ActividadesCondicionales;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        double num1 = in.nextDouble();

        System.out.println("Introduce el segundo número: ");
        double num2 = in.nextDouble();

        System.out.println("Introduce el tercer número: ");
        double num3 = in.nextDouble();

        double mayor;

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        System.out.println("El número mayor es: " + mayor);

        in.close();

    }
}