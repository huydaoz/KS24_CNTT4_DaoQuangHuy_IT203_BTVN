package hackathon;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();
        countVowelConsonant(s);

        System.out.print("\nNhập họ tên: ");
        String name = sc.nextLine();
        String normalized = normalizeName(name);

        System.out.println("Tên chuẩn: " + normalized);
        System.out.println("Username: " + createUsername(name));
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'o' || c == 'e' || c == 'u' || c == 'i';
    }

    public static void countVowelConsonant(String str) {
        int vowel = 0;
        int consonant = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if (c >= 'a' && c <= 'z') {
                if (isVowel(c)) {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }
        if (vowel > consonant) {
            System.out.println("Nguyên âm nhiều hơn (Nguyên âm: " + vowel + ", Phụ âm: " + consonant + ")");
        } else if (consonant > vowel) {
            System.out.println("Phụ âm nhiều hơn (Nguyên âm: " + vowel + ", Phụ âm: " + consonant + ")");
        } else {
            System.out.println("Bằng nhau (Nguyên âm: " + vowel + ", Phụ âm: " + consonant + ")");
        }
    }

    public static String normalizeName(String name) {
        name = name.trim().toLowerCase();

        String[] words = name.split("\\s+");

        String result = "";

        for (String w : words) {
            String firstChar = w.substring(0,1).toUpperCase();
            String remain = w.substring(1);
            result += firstChar + remain + " ";
        }
        return result.trim();
    }

    public static String createUsername(String name) {
        name = name.trim().toLowerCase();

        String[] words = name.split("\\s+");

        String username = "";

        String mainName = words[words.length-1];

        username += Character.toUpperCase(mainName.charAt(0)) + mainName.substring(1);

        for(int i=0;i<words.length-1;i++) {
            username += Character.toUpperCase(words[i].charAt(0));
        }
        return username;
    }
}