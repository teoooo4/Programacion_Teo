package Tema3.ProgramacionModular1;

import java.util.Scanner;

public class Ejercicio8 {

    public static int entero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        return sc.nextInt();
    }

    public static boolean bisiesto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public static boolean fechaValida(int dia, int mes, int ano) {
        if (ano < 1 || mes < 1 || mes > 12) return false;

        int[] diasPorMes = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (mes == 2 && bisiesto(ano)) diasPorMes[1] = 29;

        return dia >= 1 && dia <= diasPorMes[mes-1];
    }

    public static void validarFecha() {
        int dia = entero("Introduce el día (1-31): ");
        int mes = entero("Introduce el mes (1-12): ");
        int ano = entero("Introduce el año: ");

        if (fechaValida(dia, mes, ano)) System.out.println("Fecha correcta");
        else System.out.println("Fecha incorrecta");
    }

    public static void main(String[] args) {
        validarFecha();
    }
}


