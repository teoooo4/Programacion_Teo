package Tema3.ProgramacionModular1;

import java.util.Scanner;

public class Ejercicio2 {
    public static boolean isAdult(boolean edad) {

        return edad;
    }

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Escribe la edad: ");
        int edad = in.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad");

        } else {
            System.out.println("Es menor de edad");

        }
    }
}
