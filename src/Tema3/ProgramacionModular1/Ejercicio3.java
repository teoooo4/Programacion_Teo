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

    public static void areaPerimetroCirculo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el radio del círculo: ");
        double radio = sc.nextDouble();

        while (!validRadius(radio)) {
            System.out.print("Radio inválido. Introduce nuevamente: ");
            radio = sc.nextDouble();
        }

        System.out.println("Perímetro: " + calculateCirclePerimeter(radio));
        System.out.println("Área: " + calculateCircleArea(radio));
    }

    public static void main(String[] args) {
        areaPerimetroCirculo();
    }
}

