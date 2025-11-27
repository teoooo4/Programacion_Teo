package Tema3.Arrays;

import java.util.Scanner;

public class MyArray {


// ----- a) Un procedimiento que imprima el array -----
    public static void imprimir(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }


// ----- b) Una función que devuelva el máximo del array -----
    public static int maximo(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }


// ----- c) Una función que devuelva el máximo del array -----
    public static int minimo(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }


// ----- d) Una función que devuelva la media -----
    public static double media(int[] a) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }
        return (double)suma / a.length;
    }


// ----- e) Una función que te diga si un elemento existe en el array o no -----
    public static boolean existe(int[] a, int num) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) {
                return true;
            }
        }
        return false;
    }


// ----- f) Una función que haga la suma de dos vectores (arrays) -----
    public static int[] sumar(int[] a, int[] b) {
        int[] resultado = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            resultado[i] = a[i] + b[i];
        }
        return resultado;
    }


// ----- g) Una función que haga la resta de dos vectores (arrays) -----
    public static int[] restar(int[] a, int[] b) {
        int[] resultado = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            resultado[i] = a[i] - b[i];
        }
        return resultado;
    }


// ----- h) Una función que haga el prodcuto escalar de dos vectores (arrays) -----
    public static int productoEscalar(int[] a, int[] b) {
        int resultado = 0;
        for (int i = 0; i < a.length; i++) {
            resultado += a[i] * b[i];
        }
        return resultado;
    }


// ----- i) Haz una función que invierta el orden de un array -----
    public static int[] invertir(int[] a) {
        int[] inv = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            inv[i] = a[a.length - 1 - i];
        }
        return inv;
    }


// ----- j) Haz un procedimeino que invierta el orden de un array -----
    public static void invertirEnSitio(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    }


// ----- k) Haz una función que nos indique si un array es capicua o no -----
    public static boolean esCapicua(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[a.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }


// ----- l) Haz un programa con un menú que te permita introducir uno o dos vectores y hacer toas las operaciones anteriores -----
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vectorA = null;
        int[] vectorB = null;

        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Introducir vector A");
            System.out.println("2. Introducir vector B");
            System.out.println("3. Mostrar vector A");
            System.out.println("4. Máximo de A");
            System.out.println("5. Mínimo de A");
            System.out.println("6. Media de A");
            System.out.println("7. Comprobar si un número está en A");
            System.out.println("8. Sumar A + B");
            System.out.println("9. Restar A - B");
            System.out.println("10. Producto escalar A·B");
            System.out.println("11. Invertir A (función)");
            System.out.println("12. Invertir A (procedimiento)");
            System.out.println("13. ¿A es capicúa?");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    vectorA = leerVector(sc);
                    break;
                case 2:
                    vectorB = leerVector(sc);
                    break;
                case 3:
                    if (vectorA != null) imprimir(vectorA);
                    else System.out.println("Vector A no definido.");
                    break;
                case 4:
                    if (vectorA != null) System.out.println("Máximo: " + maximo(vectorA));
                    else System.out.println("Vector A no definido.");
                    break;
                case 5:
                    if (vectorA != null) System.out.println("Mínimo: " + minimo(vectorA));
                    else System.out.println("Vector A no definido.");
                    break;
                case 6:
                    if (vectorA != null) System.out.println("Media: " + media(vectorA));
                    else System.out.println("Vector A no definido.");
                    break;
                case 7:
                    if (vectorA != null) {
                        System.out.print("Número a buscar: ");
                        int num = sc.nextInt();
                        System.out.println("¿Existe? " + existe(vectorA, num));
                    } else System.out.println("Vector A no definido.");
                    break;
                case 8:
                    if (vectorA != null && vectorB != null) {
                        imprimir(sumar(vectorA, vectorB));
                    } else System.out.println("Debes definir ambos vectores.");
                    break;
                case 9:
                    if (vectorA != null && vectorB != null) {
                        imprimir(restar(vectorA, vectorB));
                    } else System.out.println("Debes definir ambos vectores.");
                    break;
                case 10:
                    if (vectorA != null && vectorB != null) {
                        System.out.println("Producto escalar: " + productoEscalar(vectorA, vectorB));
                    } else System.out.println("Debes definir ambos vectores.");
                    break;
                case 11:
                    if (vectorA != null) {
                        imprimir(invertir(vectorA));
                    } else System.out.println("Vector A no definido.");
                    break;
                case 12:
                    if (vectorA != null) {
                        invertirEnSitio(vectorA);
                        System.out.println("Vector A invertido en sitio:");
                        imprimir(vectorA);
                    } else System.out.println("Vector A no definido.");
                    break;
                case 13:
                    if (vectorA != null) {
                        System.out.println("¿Capicúa? " + esCapicua(vectorA));
                    } else System.out.println("Vector A no definido.");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);
    }


    public static int[] leerVector(Scanner sc) {
        System.out.print("Tamaño del vector: ");
        int n = sc.nextInt();
        int[] v = new int[n];
        System.out.println("Introduce los elementos:");
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        return v;
    }
}
