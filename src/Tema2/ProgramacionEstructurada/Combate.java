package Tema2.ProgramacionEstructurada;

import java.util.Random;
import java.util.Scanner;

public class Combate {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



        System.out.println("¡Bienvenido al programa Combate!\n");
        System.out.println("El cambo de batalla está listo...");
        System.out.println("A la izquiera, el poderoso GUERRERO DEL FUEGO, listo para arrasar con todo");
        System.out.println("A la derecha, el sabio MAESTRO DEL AGUA, preparado para apagar las llamas");
        System.out.println("¿Quién ganará esta pelea épica?");
        System.out.println("¡Que empiece el combate!\n\n");



        System.out.println("Valores de los luchadores");
        System.out.println("Luchador de FUEGO");
        System.out.println("Velocidad: 100, Vida: 100, Defensa: 100, Ataque: 100 y Critico: 0%\n");

        System.out.println("Luchador de AGUA");
        System.out.println("Velocidad: 100, Vida: 100, Defensa: 100, Ataque: 100 y Critico: 0%\n");

        System.out.println("¡El luchador que alcanze el 100% de su critico podra usarlo!\n\n");



        int FUEGO;
        int velocidadfuego = 100;
        int vidafuego = 100;
        int defensafuego = 100;
        int ataquefuego = 100;
        int criticofuego = 0;

        int AGUA;
        int velocidadagua = 100;
        int vidaagua = 100;
        int defensaagua = 100;
        int ataqueagua = 100;
        int criticoagua = 0;



        System.out.print("TÚ luchador es AGUA\n\n\n");



        System.out.println("=============== RONDA 1 ===============\n");

        System.out.print("===== AGUA golpea primero =====\n\n");
        ataqueagua = 16;
        vidafuego -= 16;

        System.out.println("AGUA ataca causando " + ataqueagua + " puntos de daño");
        System.out.println("Vida restante de FUEGO " + vidafuego + "\n");

        Random aleatorio = new Random(System.currentTimeMillis());
        int intAleatorio = aleatorio.nextInt(10);
        System.out.println("AGUA sube " + intAleatorio + "% de su critico\n\n");


        System.out.println("===== FUEGO golpea segundo =====\n");
        ataquefuego = 18;
        vidaagua -= 18;

        System.out.println("FUEGO ataca causando " + ataquefuego + " puntos de daño");
        System.out.println("Vida restante de AGUA " + vidaagua + "\n\n");


        System.out.println("Vida FUEGO: ");
        System.out.println("Vida AGUA: ");

//hacer un bluce para cara ronda usando el random para el daño hasta quedar en 0




        System.out.println("==========================================");
        if (vidaagua <= 0) {
            System.out.println("¡FUEGO ha ganado el combate!");
        } else {
            System.out.println("¡AGUA  ha ganado el combate!");
        }
    }
}
