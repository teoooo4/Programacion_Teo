package Tema2;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Introduce el número de mes (1-12): ");
        int mes = in.nextInt();

        System.out.print("Introduce el año: ");
        int anio = in.nextInt();

        int dias;

        if(mes == 1 || mes ==3 || mes ==5...){
            System.out.println("este mes tiene 31");
        }
        else{
            if(mes == 4 || mes==6 ...){
                System.out.println("este mes tiene 30 dias");
            }
            else{
                if(mes==2){
                    if(mes%4==0 && mes%100!=0 &&....){
                        System.out.println("tiene 28");
                    }
                    else{
                        System.out.println("tiene 29");
                    }
                }
            }
        }

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
                dias = bisiesto ? 29 : 28;
                break;
            default:
                System.out.println("Mes no válido. Debe ser un número entre 1 y 12.");
                in.close();
                return;
        }

        System.out.printf("El mes %d del año %d tiene %d días.%n", mes, anio, dias);

        in.close();
    }
}

