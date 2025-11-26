package Tema3.ProgramacionModular1;

import java.util.Scanner;

public class Ejercicio1 {

    public static int numerosigno(int numero) {
        if (numero > 0) return 1;
        else if (numero < 0) return -1;
        else return 0;
    }

    public static void mostrarSigno() {
        Scanner in = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int numero = in.nextInt();

        int signo = numerosigno(numero);

        switch (signo) {
            case 1:
                System.out.println("El número es positivo");
                break;
            case -1:
                System.out.println("El número es negativo");
                break;
            case 0:
                System.out.println("El número es cero");
                break;
            default:
                System.out.println("Error inesperado");
                break;
        }
    }

    public static void main(String[] args) {
        mostrarSigno();
    }
}
