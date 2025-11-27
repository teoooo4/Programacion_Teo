package Tema3.Arrays;

import java.util.Scanner;

public class WifiHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] habitaciones = new int[20];

        System.out.println("Simulación de cobertura WiFi en hotel (20 habitaciones)");

        System.out.print("Número de habitación (1-20): ");
        int router = sc.nextInt() - 1;

        System.out.print("Potencia del router (1-6): ");
        int potencia = sc.nextInt();


        for (int i = 0; i < habitaciones.length; i++) {
            int distancia = Math.abs(i - router);
            habitaciones[i] = Math.max(potencia - distancia, 0);
        }


        System.out.println("Cobertura WiFi en cada habitación:");
        for (int i = 0; i < habitaciones.length; i++) {
            System.out.print(habitaciones[i] + " ");
        }
    }
}
