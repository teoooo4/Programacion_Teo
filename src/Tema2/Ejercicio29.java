package Tema2;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio29 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int numeroSecreto = random.nextInt(100) + 1; // 1 a 100
        int intento = 0;
        int numeroUsuario;

        System.out.println("El número secreto");
        System.out.println("Adivina un número entre 1 y 100.");

        do {
            System.out.print("Introduce tu número: ");
            numeroUsuario = sc.nextInt();
            intento++;

            if (numeroUsuario < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("El número secreto es menor.");
            } else {
                System.out.println("Has acertado el número en " + intento + " intentos.");
            }
        } while (numeroUsuario != numeroSecreto);

        sc.close();
    }
}
