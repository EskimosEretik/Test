import java.util.Scanner;

public class Home7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char ch = s.charAt(0);
        if (Character.isDigit(ch)) {
            System.out.println("Это число");
        } else if (Character.isAlphabetic(ch)) {
            if (Character.UnicodeBlock.of(ch).equals(Character.UnicodeBlock.CYRILLIC)) {
                System.out.println("Кириллица");
            } else if (Character.UnicodeBlock.of(ch).equals(Character.UnicodeBlock.BASIC_LATIN)) {
                System.out.println("Латиница");
            }
        } else {
            System.out.println("Другой язык");
        }


    }
}
