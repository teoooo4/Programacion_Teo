package Tema1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el radio del circulo: ");
        double radio = sc.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área del circulo es: " + area);

        sc.close();
    }
}
