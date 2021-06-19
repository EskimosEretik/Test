package Task0806;

public class Task4 {
    public static void main(String[] args) {
        final int size = 10;
        int width = size * 2 - 1;
//пустой ромб
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < width; j++) {
                if (i == size - 1 && j == size - 1) {
                    System.out.print("*");
                } else {
                    if ((j == size - 1 - i || j == size - 1 + i) && i <= (size - 1) / 2) {
                        System.out.print("*");
                    } else if ((j == i || j == width - i - 1) && i > (size - 1) / 2 && i != size - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }

//заполненный ромб
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < width; j++) {
                if (i == size - 1 && j == size - 1) {
                    System.out.print("*");
                } else {
                    if (j >= size - 1 - i && j <= size - 1 + i && i <= (size - 1) / 2) {
                        System.out.print("*");
                    } else if (j >= i && j <= width - i - 1 && i > (size - 1) / 2 && i != size - 1) {
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

