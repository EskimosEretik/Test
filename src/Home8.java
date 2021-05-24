import java.util.Scanner;

public class Home8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите Х");
        int x = scanner.nextInt();
        System.out.println("Введите y");
        int y = scanner.nextInt();
        if ((x+y)%2 ==0){
            System.out.println("Yes");
        }
    }
}
