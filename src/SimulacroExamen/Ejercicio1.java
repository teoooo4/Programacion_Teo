import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        System.out.println("Menú:");
        System.out.println("(A) Aprobados y suspendidos");
        System.out.println("(B) Billetes a Madrid");
        System.out.println("(C) Salir");


        System.out.print("Selecciona una opcion (A, B o C): ");
        int menu = in.nextInt();

// No he sabido como poner las opciones en el switch

        int A;
        int B;
        int C;


        switch (menu) {
            case 1:
                System.out.println("(A) Aprobados y suspendidos");
                System.out.print("Escribe la nota: ");
                int nota = in.nextInt();


                int aprobados = 0;
                int suspendidos = 0;


                if (nota <= 10 && nota >= 5) {
                    System.out.println("Aprobado");
                    aprobados++;

                } else if (nota >= 0 && nota < 4) {
                    System.out.println("Suspendido");
                    suspendidos++;

                }

                System.out.println("Aprobados " + aprobados + ", Suspendidos " + suspendidos);

            break;

// =====================================================================================================================

            case 2:
                System.out.println("(B) Billetes a Madrid");
                System.out.print("Escribe tu edad: ");
                int edad = in.nextInt();


                if (edad >= 65) {
                    System.out.println("Descuento de 10%");

                } else if (edad >= 12 && edad <= 15) {
                    System.out.println("Descuento de 8%");

                } else if (edad >= 4 && edad <= 11) {
                    System.out.println("Descuento de  35%");

                } else if (edad < 4) {
                    System.out.println("Gratis");

                } else if (edad >= 16 && edad <= 64) {
                    System.out.println("Tarifa normal de 32€");
                }

                System.out.print("Coste total " );

            break;

// =====================================================================================================================

            case 3:
                System.out.println("(C) Salir");


            break;

        }
    }
}
