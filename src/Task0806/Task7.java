package Task0806;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number != 0) {
            System.out.print(number % 10);
            number /= 10;
        }

    }
}

