package Tema2.ActividadesCondicionales;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        int suma;
        int media;

        System.out.println("Escribe el primer numero: ");
        int numero1 = in.nextInt();

        System.out.println("Escribe el segundo numero: ");
        int numero2 = in.nextInt();

        System.out.println("Escribe el tercer numero: ");
        int numero3 = in.nextInt();

        suma = numero1 + numero2 + numero3;
        media = suma / 3;

        System.out.println("El resultado es: " + media);

    }
}