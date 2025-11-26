package Tema3.ProgramacionModular1;

import java.util.Scanner;

public class Ejercicio4 {

    public static double euro2dollar(double euros) {
        double exchange = 1.13955;
        return euros * exchange;
    }

    public static double dollar2euro(double dollars) {
        double exchange = 1.13955;
        return dollars / exchange;
    }

    public static void conversorMoneda() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Euro a dólar");
        System.out.println("2) Dólar a euro");
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Introduce los euros: ");
                double euros = sc.nextDouble();
                System.out.println(euros + "€ son " + euro2dollar(euros) + "$");
                break;
            case 2:
                System.out.print("Introduce los dólares: ");
                double dollars = sc.nextDouble();
                System.out.println(dollars + "$ son " + dollar2euro(dollars) + "€");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    public static void main(String[] args) {
        conversorMoneda();
    }
}

