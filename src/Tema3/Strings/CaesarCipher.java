package Tema3.Strings;

public class CaesarCipher {

        // Función para cifrar
        public static String encrypt(String message) {
            message = message.toUpperCase();
            StringBuilder result = new StringBuilder();
            for (char c : message.toCharArray()) {
                if (c >= 'A' && c <= 'Y') result.append((char)(c + 1));
                else if (c == 'Z') result.append('A');
                else if (c >= '0' && c <= '8') result.append((char)(c + 1));
                else if (c == '9') result.append('0');
                else result.append(c);
            }
            return result.toString();
        }

        // Función para descifrar
        public static String decrypt(String message) {
            message = message.toUpperCase();
            StringBuilder result = new StringBuilder();
            for (char c : message.toCharArray()) {
                if (c >= 'B' && c <= 'Z') result.append((char)(c - 1));
                else if (c == 'A') result.append('Z');
                else if (c >= '1' && c <= '9') result.append((char)(c - 1));
                else if (c == '0') result.append('9');
                else result.append(c);
            }
            return result.toString();
        }

        public static void main(String[] args) {
            String text = "Hola123";
            String encrypted = encrypt(text);
            String decrypted = decrypt(encrypted);

            System.out.println("Original: " + text);
            System.out.println("Encrypted: " + encrypted);
            System.out.println("Decrypted: " + decrypted);
        }
}
