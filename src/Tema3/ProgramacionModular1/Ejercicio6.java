package Tema3.ProgramacionModular1;

public class Ejercicio6 {

    public static void tablasDel1Al10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("\nTabla del " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }

    public static void main(String[] args) {
        tablasDel1Al10();
    }
}

