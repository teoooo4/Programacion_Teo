package Tema3.ProgramacionModular1;

import java.util.Scanner;

public class Ejercicio3 {

    public static boolean validRadius(double radio) {
        return radio > 0;
    }

    public static double calculateCirclePerimeter(double radio) {
        return 2 * 3.14 * radio;
    }

    public static double calculateCircleArea(double radio) {
        return 3.14 * radio * radio;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Escribe el radio del circulo: ");
        double radio = in.nextDouble();

        while (!validRadius(radio)) {
            System.out.print("Radio inválido");
            radio = in.nextDouble();
        }

        double perimetro = calculateCirclePerimeter(radio);
        double area = calculateCircleArea(radio);

        System.out.println("El perímetro es: " + perimetro);
        System.out.println("La superficie es: " + area);
    }
}
