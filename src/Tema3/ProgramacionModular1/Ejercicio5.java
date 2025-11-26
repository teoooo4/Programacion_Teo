package Tema3.ProgramacionModular1;

import java.util.Scanner;

public class Ejercicio5 {

    public static void tablaMultiplicar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para la tabla de multiplicar: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {
        tablaMultiplicar();
    }
}

