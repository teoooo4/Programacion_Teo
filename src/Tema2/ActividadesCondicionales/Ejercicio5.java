package Tema2.ActividadesCondicionales;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        double num1 = in.nextDouble();

        System.out.println("Introduce el segundo número: ");
        double num2 = in.nextDouble();

        System.out.println("Intorduce el tercer número: ");
        double num3 = in.nextDouble();

        double mediaDecimal = (num1 + num2 + num3) / 3;

        int mediaEntera = (int) Math.round(mediaDecimal);

        System.out.println("La media con decimales es: " + mediaDecimal);
        System.out.println("La media sin decimal es: " + mediaEntera);

        in.close();

    }
}