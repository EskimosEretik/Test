package Task0806;

public class Task3 {
    public static void main(String[] args) {
        final int size = 5;
        int width = size * 2 - 1;
//пустой треугольник
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < width; j++) {
                if (i == size - 1) {
                    System.out.print("*");
                } else if (i == 0 && j == size - 1) {
                    System.out.print("*");
                } else {
                    if (j == size - 1 - i || j == size - 1 + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
//заполненный треугольник
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < width; j++) {
                if (i == size - 1) {
                    System.out.print("*");
                } else if (i == 0 && j == size - 1) {
                    System.out.print("*");
                } else {
                    if (j >= size - 1 - i && j <= size - 1 + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}

