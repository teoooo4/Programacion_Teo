package Tema3.ProgramacionModular1;

import java.util.Scanner;

public class Ejercicio9 {

    public static void dibujarTriangulo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el carácter del triángulo: ");
        char c = sc.next().charAt(0);
        System.out.print("Introduce el número de líneas: ");
        int lineas = sc.nextInt();

        for (int i = 0; i < lineas; i++) {
            int numCaracteres = 2*i + 1;
            int espacios = lineas - i - 1;

            for (int j = 0; j < espacios; j++) System.out.print(" ");
            for (int j = 0; j < numCaracteres; j++) System.out.print(c);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        dibujarTriangulo();
    }
}
