package Tema3.ProgramacionModular1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void showMultiplicationTable(int numero) {
        System.out.println("Tabla de multiplicar de " + numero);

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un número entero del 1 al 10:");
        int numero = sc.nextInt();

        showMultiplicationTable(numero);
    }
}
