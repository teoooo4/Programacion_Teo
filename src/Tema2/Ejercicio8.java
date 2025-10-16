package Tema2;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        final double TIPO_CAMBIO = 1.10;

        Scanner in = new Scanner(System.in);

        System.out.println("Introduce la cantidad en euros: ");
        double euros = in.nextDouble();

        double dolares = euros * TIPO_CAMBIO;

        System.out.println(euros + "euros son" + dolares + "dolares son");

        in.close();

    }
}