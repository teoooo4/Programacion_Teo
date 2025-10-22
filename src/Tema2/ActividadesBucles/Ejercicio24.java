package Tema2.ActividadesBucles;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota;
        int aprobados = 0;
        int suspendidos = 0;

        System.out.println("Introduce la nota del alumno:");
        nota = sc.nextDouble();

        while (nota >= 0) {
            if (nota >= 5) {
                aprobados++;

            } else {
                suspendidos++;
            }

            System.out.println("Introduce otra nota:");
            nota = sc.nextDouble();
        }

        System.out.println("Resumen de notas:");
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspendidos: " + suspendidos);

        sc.close();
    }
}
