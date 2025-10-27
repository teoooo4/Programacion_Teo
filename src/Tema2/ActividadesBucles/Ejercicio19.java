package Tema2.ActividadesBucles;

public class Ejercicio19 {
    public static void main(String[] args) {

        System.out.println("Números pares entre 1 y 1000:");

        int par = 1;

        while (par <= 1000) {
            if (par % 2 == 0) {
                System.out.println(par);
            }
            par++;
        }
    }
}
