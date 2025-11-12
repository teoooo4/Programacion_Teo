package Tema1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Escribe el primer numero: ");
        numero1 = sc.nextInt();

        System.out.println("Escribe el segundo numero: ");
        numero2 = sc.nextInt();

        if (numero1 == numero2) {
            System.out.println("Son iguales");

        } else if (numero1 > numero2) {
            System.out.println("El " + numero1 + " es mayor");

        } else {
            System.out.println("El " + numero2 + " es mayor");

        }
    }
}
