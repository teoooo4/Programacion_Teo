package Tema3.ProgramacionModular2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- MyMath Test ---");

// ---------- 1.1 Círculo ----------
        System.out.print("Radio del círculo: ");
        double r = sc.nextDouble();
        System.out.println("Perímetro: " + MyMath.circlePerimeter(r));
        System.out.println("Área: " + MyMath.circleArea(r));


// ---------- 1.2 Cuadrado ----------
        System.out.print("\nLado del cuadrado: ");
        double lado = sc.nextDouble();
        System.out.println("Perímetro: " + MyMath.squarePerimeter(lado));
        System.out.println("Área: " + MyMath.squareArea(lado));


// ---------- 1.3 Rectángulo ----------
        System.out.print("\nBase del rectángulo: ");
        double base = sc.nextDouble();
        System.out.print("Altura del rectángulo: ");
        double altura = sc.nextDouble();
        System.out.println("Perímetro: " + MyMath.rectanglePerimeter(base, altura));
        System.out.println("Área: " + MyMath.rectangleArea(base, altura));


// ---------- 2. Primo / No primo ----------
        System.out.print("\nNúmero para comprobar si es primo: ");
        int num = sc.nextInt();
        System.out.println(num + (MyMath.isPrime(num) ? " es primo" : " no es primo"));


// ---------- 3,4,5,9 Dígitos ----------
        System.out.print("\nNúmero para análisis de dígitos: ");
        num = sc.nextInt();
        System.out.println("Número de dígitos: " + MyMath.numDigits(num));
        System.out.println("Dígitos pares: " + MyMath.evenDigits(num));
        System.out.println("Dígitos impares: " + MyMath.oddDigits(num));
        System.out.println("Suma de dígitos: " + MyMath.sumDigits(num));

// ---------- 6,7 Factorial ----------
        System.out.print("\nNúmero para factorial: ");
        num = sc.nextInt();
        System.out.println("Factorial iterativo: " + MyMath.factorial(num));
        System.out.println("Factorial recursivo: " + MyMath.factorialRecursive(num));

// ---------- 8. Ecuación cuadrática----------
        System.out.println("\nEcuación ax^2 + bx + c = 0");
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();
        int soluciones = MyMath.quadraticSolutions(a, b, c);
        System.out.println("Número de soluciones: " + soluciones);

        sc.close();
    }
}
