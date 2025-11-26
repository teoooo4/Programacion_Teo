package Tema3.ProgramacionModular1;

import java.util.Scanner;

public class Ejercicio10 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    Ejercicio1.mostrarSigno();
                    break;
                case 2:
                    Ejercicio2.mayorEdad();
                    break;
                case 3:
                    Ejercicio3.areaPerimetroCirculo();
                    break;
                case 4:
                    Ejercicio4.conversorMoneda();
                    break;
                case 5:
                    Ejercicio5.tablaMultiplicar();
                    break;
                case 6:
                    Ejercicio6.tablasDel1Al10();
                    break;
                case 7:
                    Ejercicio7.comprobarPrimo();
                    break;
                case 8:
                    Ejercicio8.validarFecha();
                    break;
                case 9:
                    Ejercicio9.dibujarTriangulo();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0);
    }

    public static void mostrarMenu() {
        System.out.println("\n--- MENÚ DE EJERCICIOS ---");
        System.out.println("1) Muestra el signo de un número introducido por el usuario");
        System.out.println("2) Indicia si el usuario es amyor de edad o no");
        System.out.println("3) Calcula el área y perímetro de un circulo");
        System.out.println("4) Conversor de euros a dólares y de dólares a euros");
        System.out.println("5) Mostrar tabla de multiplicar de un número");
        System.out.println("6) Mostrar tabls de muliplicar del 1 al 10");
        System.out.println("7) Comprobador de números primos");
        System.out.println("8) Comprobador de fechas");
        System.out.println("9) Dibujar triángulos");
        System.out.println("0) Salir");
        System.out.print("Elige una opción: ");
    }
}
