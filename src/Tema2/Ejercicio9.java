package Tema2;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        final double TIPO_CAMBIO = 0.91;

        Scanner in = new Scanner(System.in);

        System.out.println("Introduce la cantidad en dólares: ");
        double dolares = in.nextDouble();

        double euros = dolares * TIPO_CAMBIO;

        System.out.println(dolares + "dólares son" + euros + "euros son");

        in.close();

    }
}