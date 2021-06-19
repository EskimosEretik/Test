package Task0806;

public class Task5 {
    public static void main(String[] args) {
        final int diag = 6;
        final int row = 10;
        int width = diag * 2 + row;
//пустой параллелограмм
        for (int i = 0; i < diag; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 && j >= diag - 1 || i == diag - 1 && j <= width - diag - 1) {
                    System.out.print("*");
                } else {
                    if (j == diag - 1 - i || j == width - 1 - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }

//заполненный параллелограмм
        for (int i = 0; i < diag; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 && j >= diag - 1 || i == diag - 1 && j <= width - diag - 1) {
                    System.out.print("*");
                } else {
                    if (j >= diag - 1 - i && j <= width - 1 - i) {
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

