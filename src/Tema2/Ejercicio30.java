package Tema2;

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String salir = "no";

        System.out.println("Calculadora.");

        while (!salir.equalsIgnoreCase("si")) {
            System.out.print("Introduce el primer número: ");

            if (sc.hasNextDouble()) {
                double num1 = sc.nextDouble();
                sc.nextLine();

                System.out.print("Introduce la operación (+, -, *, /, %): ");
                String operacion = sc.nextLine();

                System.out.print("Introduce el segundo número: ");
                if (sc.hasNextDouble()) {
                    double num2 = sc.nextDouble();
                    sc.nextLine();
                    double resultado = 0;
                    boolean operacionValida = true;

                    switch (operacion) {
                        case "+":
                            resultado = num1 + num2;
                            break;

                        case "-":
                            resultado = num1 - num2;
                            break;

                        case "*":
                            resultado = num1 * num2;
                            break;

                        case "/":
                            if (num2 != 0) {
                                resultado = num1 / num2;
                            } else {
                                System.out.println("Error: división entre 0.");
                                operacionValida = false;
                            }
                            break;

                        case "%":
                            if (num2 != 0) {
                                resultado = num1 % num2;
                            } else {
                                System.out.println("Error: módulo entre 0.");
                                operacionValida = false;
                            }
                            break;

                        default:
                            System.out.println("Operación no válida.");
                            operacionValida = false;
                    }

                    if (operacionValida) {
                        System.out.println("Resultado: " + resultado);
                    }
                } else {
                    System.out.println("Número inválido. Intenta de nuevo.");
                    sc.nextLine();
                }

                System.out.print("¿Deseas salir de la calculadora? (si/no): ");
                salir = sc.nextLine();

            } else {
                System.out.println("Número inválido. Intenta de nuevo.");
                sc.nextLine();
            }
        }

        sc.close();
    }
}
