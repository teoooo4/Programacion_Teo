package Tema1;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Tema 1 - Ejercicio 5");

        int primero = 24 % 5;
        System.out.println(primero);

        // El resultado es 6 pero aparece 6.0 no se como cambiarlo
        double segundo = (double) (int) 7 / 2 + 2.5;
        System.out.println(segundo);

        double tercero = 10.8 / 2 + 2;
        System.out.println(tercero);

        int cuarto = (4 + 6) * 3 + 2 * (5 - 1);
        System.out.println(cuarto);

        float quinto = (float) 5 / 2 + 17 % 3;
        System.out.println(quinto);

        boolean sexto = 7 >= 5 || 27 != 8;
        System.out.println(sexto);
    }
}
