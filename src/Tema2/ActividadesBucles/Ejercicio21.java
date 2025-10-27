package Tema2.ActividadesBucles;

public class Ejercicio21 {
    public static void main(String[] args) {

        int suma = 0;
        int pares = 2;

        while (pares <= 1000) {
            suma = suma + pares;
            pares = pares + 2;
        }

        System.out.println("La suma de todos los números pares entre 1 y 1000 es: " + suma);
    }
}
