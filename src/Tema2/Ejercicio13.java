package Tema2;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Introduce la hora (0-23): ");
        double horas = in.nextDouble();

        System.out.println("Introduce los minutos (0-59): ");
        double minutos = in.nextDouble();

        System.out.println("Introduce los segundos (0-59): ");
        double segundos = in.nextDouble();

        segundos++;

        if (segundos == 60) {
            segundos = 0;
            minutos++;
        }

        if (minutos == 60) {
            minutos = 0;
            horas++;
        }

        if (horas == 24) {
            horas = 0;
        }

        System.out.println("La hora con un segundo más es: "
                + String.format("%02d", horas) + ":"
                + String.format("%02d", minutos) + ":"
                + String.format("%02d", segundos));

        in.close();

    }
}