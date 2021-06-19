package Task0806;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String temp = Integer.toString(number);
        int[] numbers = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
        }

        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < numbers.length; i++) {
                switch (numbers[i]) {
                    case 0:
                        if (j == 0 || j == 6) {
                            printTopBottomCenterRounded();
                        } else if (j == 1 || j == 5) {
                            printRounded();
                        } else {
                            printLongRounded();
                        }
                        System.out.print(" ");

                        break;
                    case 1:

                        if (j == 6) {
                            printTopBottomCenterRounded();
                        } else if (j == 1) {
                            printTriangleOneLevel();
                        } else {
                            printCenter();
                        }
                        break;
                    case 2:
                        if (j == 0) {
                            printTopBottomCenterRounded();
                        } else if (j == 1) {
                            printRounded();
                        } else if (j == 2) {
                            printSmallRounded();
                        } else if (j == 3) {
                            printCenter();
                        } else if (j == 4) {
                            printLeftCenter();
                        } else if (j == 5) {
                            printNotClosedRight();
                        } else {
                            printLongTopBottomCenterRounded();
                        }
                        System.out.print("  ");

                        break;
                    case 3:
                        if (j == 0 || j == 6 || j == 3) {
                            printTopBottomCenterRounded();
                        } else if (j == 2 || j == 4) {
                            printNotClosedLeft();
                        } else {
                            printRounded();
                        }
                        System.out.print("  ");

                        break;
                    case 4:
                        if (j == 1) {
                            printTriangleOneLevel();
                        } else if (j == 2) {
                            printTriangleTwoLevel();
                        } else if (j == 3) {
                            printTriangleThreeLevel();
                        } else if (j == 4) {
                            printLongCenter();
                        } else {
                            printCenter();
                        }
                        System.out.print("  ");

                        break;
                    case 5:
                        if (j == 6) {
                            printTopBottomCenterRounded();
                        } else if (j == 5) {
                            printRounded();
                        } else if (j == 4) {
                            printSmallRounded();
                        } else if (j == 3) {
                            printCenter();
                        } else if (j == 2) {
                            printLeftCenter();
                        } else if (j == 1) {
                            printNotClosedRight();
                        } else {
                            printLongTopBottomCenterRounded();
                        }
                        System.out.print("  ");

                        break;
                    case 6:
                        if (j == 6 || j == 3) {
                            printTopBottomCenterLeftNotRounded();
                        } else if (j < 3) {
                            printNotClosedRight();
                        } else {
                            printRounded();
                        }
                        System.out.print("  ");

                        break;
                    case 7:
                        if (j == 0) {
                            printLongTopBottomCenterRounded();
                        } else if (j == 1) {
                            printNotClosedLeft();
                        } else if (j == 2) {
                            printRightCenter();
                        } else if (j == 3) {
                            printCenter();
                        } else if (j == 4) {
                            printLeftCenter();
                        } else {
                            printNotClosedRight();
                        }
                        System.out.print("  ");

                        break;
                    case 8:
                        if (j == 0 || j == 6 || j == 3) {
                            printTopBottomCenterRounded();
                        } else {
                            printRounded();
                        }
                        System.out.print("  ");

                        break;
                    case 9:
                        if (j == 0 || j == 3) {
                            printTopBottomCenterRightNotRounded();
                        } else if (j > 3) {
                            printNotClosedLeft();
                        } else {
                            printRounded();
                        }
                        System.out.print("  ");

                        break;
                    default:
                        break;
                }

            }
            System.out.println("");
        }

    }

    private static void printTopBottomCenterRounded() {
        System.out.print("  ***  ");
    }

    private static void printTopBottomCenterLeftNotRounded() {
        System.out.print(" ****  ");
    }

    private static void printTopBottomCenterRightNotRounded() {
        System.out.print("  **** ");
    }

    private static void printLongTopBottomCenterRounded() {
        System.out.print(" ***** ");
    }

    private static void printRounded() {
        System.out.print(" *   * ");
    }

    private static void printLongRounded() {
        System.out.print("*     *");
    }

    private static void printSmallRounded() {
        System.out.print(" *  *  ");
    }

    private static void printNotClosedRight() {
        System.out.print(" *     ");
    }

    private static void printNotClosedLeft() {
        System.out.print("     * ");
    }

    private static void printCenter() {
        System.out.print("   *   ");
    }

    private static void printLeftCenter() {
        System.out.print("  *    ");
    }

    private static void printRightCenter() {
        System.out.print("    *  ");
    }

    private static void printTriangleOneLevel() {
        System.out.print("  **   ");
    }

    private static void printTriangleTwoLevel() {
        System.out.print(" * *   ");
    }

    private static void printTriangleThreeLevel() {
        System.out.print("*  *   ");
    }

    private static void printLongCenter() {
        System.out.print("****** ");
    }
}

