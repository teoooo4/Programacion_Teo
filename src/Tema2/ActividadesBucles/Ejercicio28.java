package Tema2.ActividadesBucles;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio28 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int numeroLoteria = random.nextInt(100000);

        System.out.println("Lotería de Navidad");
        System.out.println("Se ha generado un número aleatorio de 0 a 99999.");
        System.out.println("Tienes hasta 5 intentos para adivinarlo.");

        for (int intento = 1; intento <= 5; intento++) {
            System.out.print("Introduce tu número (intento " + intento + "): ");
            int numeroUsuario = sc.nextInt();

            if (numeroUsuario == numeroLoteria) {
                System.out.println("Has acertado el número de la lotería.");
                break;

            } else {
                System.out.println("Lo siento, no has acertado. Intenta de nuevo.");
            }
        }

        System.out.println("El número de la lotería era: " + numeroLoteria);
        sc.close();
    }
}

