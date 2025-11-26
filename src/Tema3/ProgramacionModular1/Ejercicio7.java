package Tema3.ProgramacionModular1;

import java.util.Scanner;

public class Ejercicio7 {

    public static boolean esPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void comprobarPrimo() {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduce números (0 para salir):");

        do {
            numero = sc.nextInt();
            if (numero > 0) {
                if (esPrimo(numero)) System.out.println(numero + " es primo");
                else System.out.println(numero + " no es primo");
            }
        } while (numero != 0);
        System.out.println("Fin.");
    }

    public static void main(String[] args) {
        comprobarPrimo();
    }
}
