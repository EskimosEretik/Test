import java.util.Scanner;

public class Home2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Скажите сколько сейчас время");
        int time = scanner.nextInt();
        if (time >= 0 && time <= 6) {
            System.out.println("Спокойной ночи");
        } else if (time > 6 && time <= 12) {
            System.out.println("Доброе утро");
        } else if (time > 12 && time <= 19) {
            System.out.println("Тогда продуктивного дня");
        } else if (time > 19 && time <= 23) {
            System.out.println("Спасибо,приятного вечера");
        }
    }
}
