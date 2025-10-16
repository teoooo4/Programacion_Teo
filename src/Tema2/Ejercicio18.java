package Tema2;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Introduce un número para calcular su raíz cuadrada: ");
        double numero = in.nextDouble();

        if (numero < 0) {
            System.out.println("Error: no se puede calcular la raíz cuadrada de un número negativo.");
        } else {
            double raiz = Math.sqrt(numero);
            System.out.printf("La raíz cuadrada de %.2f es %.4f%n", numero, raiz);
        }

        in.close();
    }
}

