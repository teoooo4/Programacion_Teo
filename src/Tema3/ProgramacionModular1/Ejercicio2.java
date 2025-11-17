package Tema3.ProgramacionModular1;

import java.util.Scanner;

public class Ejercicio2 {
    public static boolean isAdult(int edad) {

        return edad >= 18;
    }

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Escribe la edad: ");
        int edad = in.nextInt();

        if (isAdult(edad)) {
            System.out.println("Es mayor de edad");

        } else {
            System.out.println("Es menor de edad");

        }
    }
}
