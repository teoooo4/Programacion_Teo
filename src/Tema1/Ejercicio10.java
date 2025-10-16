package Tema1;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número real: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduce el segundo número real: ");
        double num2 = sc.nextDouble();

        double suma = num1 + num2;
        double producto = num1 * num2;

        System.out.println("Suma: " + suma);
        System.out.println("Producto: " + producto);

        if (num2 != 0) {
            double division = num1 / num2;
            double resto = num1 % num2;
            System.out.println("División: " + division);
            System.out.println("Resto: " + resto);
        } else {
            System.out.println("No se puede dividir ni calcular el resto con 0.");
        }

        sc.close();
    }
}
