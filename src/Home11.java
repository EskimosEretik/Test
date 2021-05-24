import java.util.Scanner;

public class Home11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int countFlat = 4;
        final int countFloor = 9;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите номер квартиры:");
        int flat = scanner.nextInt();
        double entranceFloor = countFloor * countFlat;
        double entrance = flat / entranceFloor;
        int num;
        if (entrance % 1 > 0) {
            num = (int) entrance + 1;
        } else {
            num = (int) entrance;
        }
        System.out.println("Квартира в " + num + " подъезде");


    }
}
