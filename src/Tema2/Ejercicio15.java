package Tema2;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Introduce el número de mes (1-12): ");
        int mes = in.nextInt();

        System.out.print("Introduce el año: ");
        int anio = in.nextInt();

        int dias = 0;

            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                System.out.println("Este mes tiene 31 días");
            }
            else {
                if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    System.out.println("Este mes tiene 30 días");

                } else {
                    if (mes == 2){
                        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                            System.out.println("Este mes tiene 28 días");

                        } else {
                            System.out.println("Este mes tiene 29 días");
                        }
                    }
                }
            }


        System.out.printf("El mes %d del año %d tiene %d días.%n", mes, anio, dias);

        in.close();

    }
}

