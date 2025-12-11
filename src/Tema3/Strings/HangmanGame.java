package Tema3.Strings;

import java.util.Scanner;

public class HangmanGame {

        public static void play() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Usuario 1, introduce la palabra: ");
            String word = sc.nextLine().toUpperCase();
            clearConsole();

            int attempts = 6;
            String guessed = "";
            char[] display = new char[word.length()];
            for (int i = 0; i < word.length(); i++) display[i] = '-';

            while (attempts > 0 && new String(display).contains("-")) {
                System.out.println("Intentos restantes: " + attempts);
                System.out.println(display);
                System.out.print("Introduce una letra: ");
                char letter = sc.nextLine().toUpperCase().charAt(0);

                if (word.contains(String.valueOf(letter))) {
                    for (int i = 0; i < word.length(); i++) {
                        if (word.charAt(i) == letter) display[i] = letter;
                    }
                } else {
                    attempts--;
                }
            }

            if (new String(display).equals(word)) System.out.println("¡Ganaste!");
            else System.out.println("Perdiste. La palabra era: " + word);
        }

        private static void clearConsole() {
            for (int i = 0; i < 50; i++) System.out.println();
        }

        public static void main(String[] args) {
            play();
        }
}
