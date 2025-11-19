package Tema3.ProgramacionModular1;

import java.util.Scanner;

public class Ejercicio5 {
    public static int multiplicar(int numero) {

        int multiplicador = 1;
        
        while (multiplicador <= 9) {
            multiplicador ++;
            System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
        }

        return numero;

    }



    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un número entero entre 1 y 10:");
        int numero = sc.nextInt();

        System.out.println("Tabla de multiplicar de " + numero);

        multiplicar(numero);

    }
}
