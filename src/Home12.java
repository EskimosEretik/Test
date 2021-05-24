import java.util.Scanner;

public class Home12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите шестизначное число");
        int a = scanner.nextInt();
        if (a / 1000000 % 10 == 0) {
            int a6 = a % 10;
            int a5 = a / 10 % 10;
            int a4 = a / 100 % 10;
            int a3 = a / 1000 % 10;
            int a2 = a / 10000 % 10;
            int a1 = a / 100000 % 10;
            if (a1 + a2 + a3 == a4 + a5 + a6) {
                System.out.println("Счастливое число");
            } else
                System.out.println("Не счастлвое");
        } else {
            System.out.println("Не шестизначное");
        }


    }

}
