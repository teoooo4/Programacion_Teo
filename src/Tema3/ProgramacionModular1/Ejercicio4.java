package Tema3.ProgramacionModular1;

import java.util.Scanner;

public class Ejercicio4 {
    public static boolean showMenu(boolean menu) {

        return menu;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1) Euro a dolar");
        System.out.println("2) Dolar a euro");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Introduce los euros €");
                int euro2dollar = sc.nextInt();

                double dolar = euro2dollar * 1.13955;

                System.out.println("El " + euro2dollar + "€ es en dolares " + dolar + "$");
                break;

            case 2:
                System.out.println("Introduce los dolares $");
                int dollar2euro = sc.nextInt();

                double euro = dollar2euro * 1.13955;

                System.out.println("El " + dollar2euro + "$ es en euros " + euro + "€");
                break;

            default:
                System.out.println("Opcion no valida");
        }
    }
}
