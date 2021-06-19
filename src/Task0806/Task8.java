package Task0806;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = (number == 0) ? 1 : 0;
        int summ = 0;
        while (number != 0) {
            count++;
            summ += number % 10;
            number /= 10;
        }
        System.out.println("Количество цифр: " + count);
        System.out.println("Сумма цифр: " + summ);
    }
}


