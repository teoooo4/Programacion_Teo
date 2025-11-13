package Tema3.ProgramacionModular1;

import java.util.Scanner;

public class Ejercicio3 {
    public static boolean validRadius(boolean radio) {

        return radio;
    }

    public static double calculateCirclePerimeter(double perimetro) {

        return perimetro;
    }

    public static double calculateCircleArea(double area) {

        return area;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Escribe el radio: ");
        int radio = in.nextInt();

        double perimetro = 2 * 3.14 * radio;
        double superficie = 3.14 * (radio * radio);

        System.out.println("La superficie es: " + superficie + " y el perimetro: " + perimetro);

    }
}
