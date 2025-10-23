package Tema2.ProgramacionEstructurada;

import java.util.Random;
import java.util.Scanner;

public class Combate {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random aleatorio = new Random(System.currentTimeMillis());


        System.out.println("¡\uD83D\uDCA5 Bienvenido al programa Combate \uD83D\uDCA5!\n");
        System.out.println("El cambo de batalla está listo...");
        System.out.println("A la izquiera, el poderoso GUERRERO DEL \uD83D\uDD25 FUEGO \uD83D\uDD25, listo para arrasar con todo");
        System.out.println("A la derecha, el sabio MAESTRO DEL AGUA, preparado para apagar las llamas");
        System.out.println("¿Quién ganará esta pelea épica?");
        System.out.println("¡Que empiece el combate!\n\n");



        System.out.println("========== Valores de los luchadores ===========");
        System.out.println("Luchador de \uD83D\uDD25 FUEGO \uD83D\uDD25");
        System.out.println("Velocidad: 100, Vida: 100, Defensa: 100, Ataque: 100 y Critico: 0%\n");

        System.out.println("Luchador de \uD83D\uDCA7 AGUA \uD83D\uDCA7");
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



        System.out.print("===== TÚ luchador es \uD83D\uDCA7 AGUA \uD83D\uDCA7 =====\n\n\n");



        int ronda = 1;

        while (vidaagua > 0 && vidafuego > 0) {
            System.out.println("=============== \uD83E\uDD4A RONDA " + ronda + " \uD83E\uDD4A ===============\n");

            System.out.print("===== \uD83D\uDCA7 AGUA \uD83D\uDCA7 golpea primero =====\n\n");
            ataqueagua = (int)(Math.random() * 50);
            vidafuego -= ataqueagua;

            System.out.println("AGUA ataca causando " + ataqueagua + " puntos de daño");
            System.out.println("Vida restante de FUEGO " + vidafuego + "\n");

            int aumentoCriticoagua = aleatorio.nextInt(40);
            criticoagua += aumentoCriticoagua;
            if (criticoagua > 100) criticoagua = 100;
            System.out.println("AGUA sube " + aumentoCriticoagua + "% de su critico\n\n");

            if (criticoagua >= 100) {
                System.out.println("¡\uD83D\uDCA5 AGUA activa el critico con daño doble \uD83D\uDCA5!");
                vidafuego -= ataqueagua;
                criticoagua = 0;
            }


            System.out.println("===== \uD83D\uDD25 FUEGO \uD83D\uDD25 golpea segundo =====\n");
            ataquefuego = (int)(Math.random() * 50);
            vidaagua -= ataquefuego;

            System.out.println("FUEGO ataca causando " + ataquefuego + " puntos de daño");
            System.out.println("Vida restante de AGUA " + vidaagua + "\n");

            int aumentoCriticoFuego = aleatorio.nextInt(40);
            criticofuego += aumentoCriticoFuego;
            if (criticofuego > 100) criticofuego = 100;
            System.out.println("FUEGO sube " + aumentoCriticoFuego + "% de su critico\n\n");

            if (criticofuego >= 100) {
                System.out.println("¡\uD83D\uDCA5 FUEGO activa el critico con daño doble\uD83D\uDCA5 !");
                vidaagua -= ataquefuego;
                criticofuego = 0;
            }

            ronda++;

        }



        System.out.println("==========================================");
        if (vidaagua <= 0) {
            System.out.println("¡\uD83D\uDD25 FUEGO \uD83D\uDD25 ha ganado el combate!");
        } else {
            System.out.println("¡\uD83D\uDCA7 AGUA \uD83D\uDCA7 ha ganado el combate!");
        }
    }
}
