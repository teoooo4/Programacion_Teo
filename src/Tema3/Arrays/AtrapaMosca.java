package Tema3.Arrays;

import java.util.Scanner;
import java.util.Random;

public class AtrapaMosca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        int mosca = rand.nextInt(15);
        boolean atrapada = false;

        System.out.println("¡Bienvenido a Atrapa a la Mosca!");
        System.out.println("Elige una posición entre 1 y 15.");

        while (!atrapada) {
            System.out.print("Tu elección: ");
            int eleccion = sc.nextInt() - 1;

            if (eleccion == mosca) {
                System.out.println("¡Felicidades! Has atrapado a la mosca.");
                atrapada = true;
            } else if (eleccion == mosca - 1 || eleccion == mosca + 1) {

                if (mosca == 0) mosca++;
                else if (mosca == 14) mosca--;
                else mosca += rand.nextBoolean() ? 1 : -1;
                System.out.println("¡La mosca se ha escapado!");
            } else {
                System.out.println("¡Fallaste!");
            }
        }
    }
}
