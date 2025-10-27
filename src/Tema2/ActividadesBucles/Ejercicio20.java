package Tema2.ActividadesBucles;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero:");
        int A = sc.nextInt();

        System.out.println("Introduce un número entero:");
        int B = sc.nextInt();

        if (B < A) {
            System.out.println("Numeros impares entre " + A + " y " + B);
            int impares = A + 1;
            while (impares < B) {
                if (impares % 2 != 0) {
                    System.out.println(impares);
                }
                impares++;
            }
            sc.close();

        }
    }
}
