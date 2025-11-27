package Tema3.ProgramacionModular2;

import java.util.Scanner;

public class MyMath {


// ---------- 1.1 Círculo ----------
    public static double circlePerimeter(double r) {
        return 2 * Math.PI * r;
    }

    public static double circleArea(double r) {
        return Math.PI * r * r;
    }


// ---------- 1.2 Cuadrado ----------
    public static double squarePerimeter(double lado) {
        return 4 * lado;
    }

    public static double squareArea(double lado) {
        return lado * lado;
    }


// ---------- 1.3 Rectángulo ----------
    public static double rectanglePerimeter(double base, double altura) {
        return 2 * (base + altura);
    }

    public static double rectangleArea(double base, double altura) {
        return base * altura;
    }


// ---------- 2. Primo / No primo ----------
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isNotPrime(int n) {
        return !isPrime(n); // Reutiliza el método anterior
    }


// ---------- 3. Número de dígitos ----------
    public static int numDigits(int n) {
        n = Math.abs(n);
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }


// ---------- 4. Dígitos pares ----------
    public static int evenDigits(int n) {
        n = Math.abs(n);
        int count = 0;
        while (n > 0) {
            int d = n % 10;
            if (d % 2 == 0) count++;
            n /= 10;
        }
        return count;
    }


// ---------- 5. Dígitos impares ----------
    public static int oddDigits(int n) {
        n = Math.abs(n);
        int count = 0;
        while (n > 0) {
            int d = n % 10;
            if (d % 2 != 0) count++;
            n /= 10;
        }
        return count;
    }


// ---------- 6. Factorial iterativo ----------
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }


// ---------- 7. Factorial recursivo ----------
    public static long factorialRecursive(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }


// ---------- 8. Número de soluciones de ecuación cuadrática ----------
    public static int quadraticSolutions(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        if (D > 0) return 2;
        else if (D == 0) return 1;
        else return 0;
    }


// ---------- 9. Suma de dígitos ----------
    public static int sumDigits(int n) {
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

