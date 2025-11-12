package Tema2.ActividadesCondicionales;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int base;
        int altura;
        int superficie;

        System.out.println("Escribe la base del triángulo: ");
        base = in.nextInt();

        System.out.println("Escribe la altura del triángulo: ");
        altura = in.nextInt();

        superficie = (base * altura) / 2;

        System.out.println("La superficie del triángulo es: " + superficie);

    }
}