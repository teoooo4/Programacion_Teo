package Tema1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primero número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        int suma = num1 + num2;
        int resta = num1- num2;
        int producto = num1 * num2;

        if (num2 != 0){
            int  division = num1 / num2;
            int resto = num1 % num2;
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Producto: " + producto);
            System.out.println("División: " + division);
            System.out.println("Resto: " + resto);
        } else {
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Producto: " + producto);
            System.out.println("No se puede divirdir entre 0.");
        }

        sc.close();
    }
}
