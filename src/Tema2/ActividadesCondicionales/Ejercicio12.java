package Tema2.ActividadesCondicionales;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        double num1 = in.nextDouble();

        System.out.println("Introduce el segundo número: ");
        double num2 = in.nextDouble();

        System.out.println("Introduce el tercer número: ");
        double num3 = in.nextDouble();

        double mayor, medio, menor;

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
            if (num2 >= num3) {
                medio = num2;
                menor = num3;
            } else {
                medio = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
            if (num1 >= num3) {
                medio = num1;
                menor = num3;
            } else {
                medio = num3;
                menor = num1;
            }
        } else {
            mayor = num3;
            if (num1 >= num2) {
                medio = num1;
                menor = num2;
            } else  {
                medio = num2;
                menor = num1;
            }
        }

        System.out.println("Los números ordenador de mayor a menor son: ");

        in.close();

    }
}