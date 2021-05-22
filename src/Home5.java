import java.util.Scanner;

public class Home5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату рождения в формате dd/MM/yyyy");
        String dr = scanner.next();
        String[] arr = dr.split("/");
        int day = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int yer = Integer.parseInt(arr[2]);
        if ((month == 1 && day >= 20) || (month == 2 && day <= 19)) {
            System.out.println("Водолей");
        } else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)) {
            System.out.println("Рыбы");
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            System.out.println("Овен");
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 21)) {
            System.out.println("Телец");
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            System.out.println("Близнецы");
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            System.out.println("Рак");
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            System.out.println("Лев");
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            System.out.println("Дева");
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 23)) {
            System.out.println("Весы");
        } else if ((month == 10 && day >= 24) || (month == 11 && day <= 22)) {
            System.out.println("Скорпион");
        } else if ((month == 11 && day >= 23) || (month == 12 && day <= 21)) {
            System.out.println("Стрелец");
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            System.out.println("Козерог");
        }

        String[] yn = {"Крыса","Бык","Тигр","Кролик","Дракон","Змея","Лошадь","Коза","Обезьяна","Петух","Собака","Свинья" };
        int yerWestToday = 1;
        int yearNow  = 2021;

        int cnt = (yearNow - yer)%12;
        int indexYear = (12 - cnt) + yerWestToday;
        if(indexYear == 12){
            indexYear = 0;
        }
        String yearWestRes = yn[indexYear];
        System.out.println(yearWestRes);
    }
}
