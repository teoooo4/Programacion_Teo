package Tema3.Strings;

public class MyString {

        // a) Cadena invertida y en mayúsculas
        public static String reverseAndUpper(String str) {
            String reversed = new StringBuilder(str).reverse().toString();
            return reversed.toUpperCase();
        }

        // b) Contar vocales
        public static int countVowels(String str) {
            int count = 0;
            str = str.toLowerCase();
            for (char c : str.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }
            return count;
        }

        // c) Palabra más larga
        public static String longestWord(String str) {
            String[] words = str.split("\\s+"); // separa por espacios
            String longest = "";
            for (String word : words) {
                if (word.length() > longest.length()) {
                    longest = word;
                }
            }
            return longest;
        }

        // d) Número de veces que una cadena aparece en otra
        public static int countOccurrences(String str, String sub) {
            int count = 0;
            int index = 0;
            while ((index = str.indexOf(sub, index)) != -1) {
                count++;
                index += sub.length();
            }
            return count;
        }

        // e) Número de palabras
        public static int countWords(String str) {
            if (str.trim().isEmpty()) return 0;
            return str.trim().split("\\s+").length;
        }

        // f) Formatear número de teléfono
        public static String formatPhone(String number) {
            if (number.length() < 2) return number;
            String countryCode = number.substring(0, 2);
            String rest = number.substring(2);
            return "(+" + countryCode + ")-" + rest.substring(0, 3) + "-" + rest.substring(3);
        }

        // g) Histograma de vocales
        public static void vowelHistogram(String str) {
            str = str.toLowerCase();
            char[] vowels = {'a','e','i','o','u'};
            for (char v : vowels) {
                int count = 0;
                for (char c : str.toCharArray()) {
                    if (c == v) count++;
                }
                System.out.print(v + " " + count + " ");
                for (int i = 0; i < count; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}