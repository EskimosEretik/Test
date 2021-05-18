import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int day = 86400;
        int hour = 3600;
        int min = 60;
        Scanner in = new Scanner(System.in);
        int time = in.nextInt();
        System.out.println("Дней:" + time / day + "Часов:" + (time % day) / hour + "Минут" + ((time % day) % hour) / min + "Секунд:" + time % min);
    }

}
