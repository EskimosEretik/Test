import java.util.Scanner;

public class Home6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Год високосный - 366 дней");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Год високосный - 366 дней");
        }else {
            System.out.println("365 дней");
        }
    }
}
