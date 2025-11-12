package Tema2.ActividadesCondicionales;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        int base;
        int altura;
        int superficie;
        int perimetro;

        System.out.println("Escribe la base de un rectángulo: ");
        base = in.nextInt();

        System.out.println("Escribe la altura de un rectángulo: ");
        altura = in.nextInt();

        superficie = base * altura;
        perimetro = (2 * altura) + (2 * base);

        System.out.println("La superficie es: " + superficie);
        System.out.println("La perimetro es: " + perimetro);
    }
}
