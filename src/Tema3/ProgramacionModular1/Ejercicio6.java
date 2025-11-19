package Tema3.ProgramacionModular1;

import java.util.Scanner;

public class Ejercicio6 {
    public static int tabla(int numero) {

        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
        }

        return numero;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Estas son todas las tablas de multiplicar del 1 al 10:");

        for (int numero = 1; numero <= 10; numero++) {
            tabla(numero);

        }
    }
}
