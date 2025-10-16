package Tema2;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Introduce 'D' para convertir EUR -> USD o 'E' para USD -> EUR: ");
        String opcion = in.next().trim().toUpperCase();

        //buscar como leer un caracter por teclado
        char letra ='D';

        System.out.print("Introduce la cantidad a convertir: ");
        double cantidad = in.nextDouble();

        double tasaEURaUSD = 1.10; // 1 EUR = 1.10 USD (ejemplo)
        double tasaUSDaEUR = 1.0 / tasaEURaUSD;

        if (letra == 'D') {
            double resultado = cantidad * tasaEURaUSD;
            System.out.printf("%.2f EUR son %.2f USD (tasa usada: %.4f).%n", cantidad, resultado, tasaEURaUSD);
        } else if ("E".equals(opcion)) {//letra == 'E'
            double resultado = cantidad * tasaUSDaEUR;
            System.out.printf("%.2f USD son %.2f EUR (tasa usada: %.4f).%n", cantidad, resultado, tasaUSDaEUR);
        } else {
            System.out.println("Opción no válida. Usa 'D' o 'E'.");
        }

        in.close();
    }
}

