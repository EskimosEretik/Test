import java.util.Scanner;

public class Home9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x и y начала отрезка через запятую");
        String s = scanner.next();
        String[] start = s.split(",");
        int x = Integer.parseInt(start[0]);
        int y = Integer.parseInt(start[1]);
        System.out.println("Введите x и y конца отрезка через запятую");
        String s1=scanner.next();
        String[] end =s1.split(",");
        int x1 = Integer.parseInt(end[0]);
        int y1= Integer.parseInt(end[1]);
        if (x==x1&&y!=y1){
            System.out.println("Отвесная");
        }else if (y==y1&&x!=x1){
            System.out.println("Ровная");
        }else if (x>x1&&y!=y1){
            System.out.println("Спуск");
        }else if (x<x1&&y!=y1){
            System.out.println("Подъём");
        }else {
            System.out.println("Это точка");
        }


    }
}
