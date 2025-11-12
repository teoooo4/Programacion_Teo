package Tema2.ActividadesCondicionales;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;

        System.out.print("Escribe el primer numero: ");
        numero1 = in.nextInt();
        System.out.print("Escribe el segundo numero: ");
        numero2 = in.nextInt();
        System.out.print("Escribe el tercer numero: ");
        numero3 = in.nextInt();

        if (numero1 > numero2) {
            System.out.println("El numero " + numero1 + " es mayor");

        } else if (numero2 > numero3) {
            System.out.println("El numero " + numero2 + " es mayor");

        } else if (numero3 > numero1) {
            System.out.println("El numero " + numero3 + " es mayor");

        }
    }
}