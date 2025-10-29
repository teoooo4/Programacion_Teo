package Tema2.ProgramacionEstructurada;

import java.util.Random;
import java.util.Scanner;

public class Combate {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random aleatorio = new Random(System.currentTimeMillis());


// ==================================================================================================


        // Introducción al juego
        System.out.println("¡\uD83D\uDCA5 Bienvenido al programa Combate \uD83D\uDCA5!\n");
        System.out.println("El cambo de batalla está listo...");
        System.out.println("A la izquiera, el poderoso GUERRERO DEL \uD83D\uDD25 FUEGO \uD83D\uDD25, listo para arrasar con todo");
        System.out.println("A la derecha, el sabio MAESTRO DEL \uD83D\uDCA7 AGUA \uD83D\uDCA7, preparado para apagar las llamas");
        System.out.println("¿Quién ganará esta pelea épica?");
        System.out.println("¡Que empiece el combate!\n\n");


// ==================================================================================================


        // Valores base de los luchadores
        System.out.println("========== Valores de los luchadores ===========");
        System.out.println("Luchador de \uD83D\uDD25 FUEGO \uD83D\uDD25");
        System.out.println("Velocidad: 100, Vida: 100, Defensa: 100, Ataque: 100 y Critico: 0%\n");


        System.out.println("Luchador de \uD83D\uDCA7 AGUA \uD83D\uDCA7");
        System.out.println("Velocidad: 100, Vida: 100, Defensa: 100, Ataque: 100 y Critico: 0%\n");


        System.out.println("¡El luchador que alcanze el 100% de su critico podra usarlo!\n\n");


// ==================================================================================================


        // Variables de FUEGO
        int vidafuego = 100;
        int ataquefuego;


        // Variables de AGUA
        int vidaagua = 100;
        int ataqueagua;



        System.out.print("===== TÚ luchador es \uD83D\uDCA7 AGUA \uD83D\uDCA7 =====\n\n\n");


// ==================================================================================================


        // Contador de rondas
        int ronda = 1;


// ==================================================================================================


        // Bucle del combate
        while (vidaagua > 0 && vidafuego > 0) {
            System.out.println("=============== \uD83E\uDD4A RONDA " + ronda + " \uD83E\uDD4A ===============\n");


// ==================================================================================================


            // Turno de AGUA
            System.out.print("===== \uD83D\uDCA7 AGUA \uD83D\uDCA7 golpea primero =====\n\n");


            // Se genera un daño aleatorio para el ataque entre 0 y 29
            ataqueagua = (int)(Math.random() * 30);


            // Hay un 50% de probabilidad que pueda usar el critico
            if (aleatorio.nextBoolean()) {
                int dañototal = ataqueagua * 2;
                vidafuego -= dañototal;
                System.out.println("\uD83D\uDCA5 CRÍTICO \uD83D\uDCA5 AGUA inflige " + dañototal + " puntos de daño!");

            } else {
                // Daño normal si no hay critico
                vidafuego -= ataqueagua;
                System.out.println("AGUA ataca causando " + ataqueagua + " puntos de ataque!");
            }


            // Para que la vida de FUEGO no sea negativa
            if (vidafuego < 0) vidafuego = 0;
            System.out.println("Vida restante de FUEGO " + vidafuego + "\n");



            // Si FUEGO muere ( <= 0 de vida) termina el combate
            if (vidafuego <= 0) break;


// ==================================================================================================


            // Turno de FUEGO
            System.out.println("===== \uD83D\uDD25 FUEGO \uD83D\uDD25 golpea segundo =====\n");


            // FUEGO tiene un ataque aleatorio de daño
            ataquefuego = (int)(Math.random() * 30);


            // Hay un 50% de probabilidad que pueda usar el critico
            if (aleatorio.nextBoolean()) {
                int dañototal = ataquefuego * 2;
                vidaagua -= dañototal;
                System.out.println("\uD83D\uDCA5 CRITICO \uD83D\uDCA5 FUEGO inflige " + dañototal + " puntos de daño!");

            } else {
                // Daño normal si no hay critico
                vidaagua -= ataquefuego;
                System.out.println("FUEGO ataca causando " + ataquefuego + " puntos de daño");
            }


            // Para que la vida de AGUA no sea negativa
            if (vidaagua < 0) vidaagua = 0;
            System.out.println("Vida restante de AGUA " + vidaagua + "\n");


            // Si AGUA muere ( <= 0 de vida) termina el combate
            if (vidaagua <= 0) break;


// ==================================================================================================


            // Otra ronda hasta que el blucue se rompa con alguna vida de los luchadores en 0
            ronda++;


// ==================================================================================================


            // Pausa entre rondas para que sea mas legible
            System.out.println("Pulsa ENTER para continuar...\n\n\n");
            in.nextLine();

        }


// ==================================================================================================


        // Fin de combate
        System.out.println("==========================================");
        if (vidaagua <= 0) {
            System.out.println("¡\uD83D\uDD25 FUEGO \uD83D\uDD25 ha ganado el combate!");

        } else {
            System.out.println("¡\uD83D\uDCA7 AGUA \uD83D\uDCA7 ha ganado el combate!");
        }
    }
}
