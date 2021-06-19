package Task0806;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество ступенек");
        int count = scanner.nextInt();
        int limit = count * 2 + 1;
        for (int i = 0; i < limit; i++) {
            if (i % 2 == 0 && i < limit - 1 && i != 0) {
                System.out.print("*");
                System.out.println("");
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println("");
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else {
                System.out.print("*");
            }
        }
    }
}
