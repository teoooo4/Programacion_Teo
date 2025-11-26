package Tema3.ProgramacionModular1;

import java.util.Scanner;

public class Ejercicio2 {

    public static boolean isAdult(int edad) {
        return edad >= 18;
    }

    public static void mayorEdad() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        if (isAdult(edad)) System.out.println("Es mayor de edad");
        else System.out.println("Es menor de edad");
    }

    public static void main(String[] args) {
        mayorEdad();
    }
}

