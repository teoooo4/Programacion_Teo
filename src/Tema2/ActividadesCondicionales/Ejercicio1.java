package Tema2.ActividadesCondicionales;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        int lado;
        int superficie;
        int perimetro;

        System.out.println("Escribe el lado de un cuadrado: ");
        lado = in.nextInt();

        superficie = lado * 2;
        perimetro = 4 * lado;

        System.out.println("La superficie es: " + superficie);
        System.out.println("El perimetro es: " + perimetro);

    }
}
