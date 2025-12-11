package Tema3.Strings;

import java.util.Scanner;

public class Lingo {

        public static void play() {
            Scanner sc = new Scanner(System.in);
            String hidden = "HUESO"; // se puede cambiar o generar aleatorio
            int attempts = 5;

            while (attempts > 0) {
                System.out.print("Introduce una palabra de 5 letras: ");
                String guess = sc.nextLine().toUpperCase();

                if (guess.length() != 5) {
                    System.out.println("La palabra debe tener 5 letras.");
                    continue;
                }

                String hint = "";
                for (int i = 0; i < 5; i++) {
                    if (guess.charAt(i) == hidden.charAt(i)) hint += guess.charAt(i);
                    else if (hidden.contains(String.valueOf(guess.charAt(i)))) hint += "*";
                    else hint += "-";
                }

                System.out.println("Hint: " + hint);
                if (guess.equals(hidden)) {
                    System.out.println("¡Congratulations!");
                    break;
                }

                attempts--;
            }

            if (attempts == 0) System.out.println("Se acabaron los intentos. La palabra era: " + hidden);
        }

        public static void main(String[] args) {
            play();
        }
}
