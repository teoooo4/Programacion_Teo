package Tema1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entre 1 y 6: ");
        int cara = sc.nextInt();

        if (cara < 1 || cara > 6) {
            System.out.println("Número incorrecto. Debe estar entre 1 y 6.");
        } else {

            int caraOpuesta = 7 - cara;
            System.out.println("La cara opuesta del dado es: " + caraOpuesta);
        }

        sc.close();
    }
}
