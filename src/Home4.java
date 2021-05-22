import java.util.Scanner;

public class Home4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите х");
        int x = scanner.nextInt();
        System.out.println("Введите y");
        int y = scanner.nextInt();
        if(x > 0 && y > 0){
            System.out.println("I четверть");
        }else if (x < 0 && y > 0){
            System.out.println("II четверть");
        }else if (x < 0 && y < 0){
            System.out.println("III четверть");
        }else if (x > 0 && y < 0){
            System.out.println("IV четверть");
        }else {
            System.out.println("Начало координат");
        }
    }
}
