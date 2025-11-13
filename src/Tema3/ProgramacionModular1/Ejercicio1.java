package Tema3.ProgramacionModular1;

import java.util.Scanner;

public class Ejercicio1 {
    public static int numberSign(int numero) {

        return numero;
    }

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Escribe un número: ");
        int numero = in.nextInt();

        if (numero > 0) {
            System.out.println("El numero es positivo");

        } else if (numero < 0) {
            System.out.println("El numero es negativo");

        } else if (numero == 0) {
            System.out.println("El numero es zero");
        }
    }
}