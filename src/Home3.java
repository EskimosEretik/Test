import java.util.Scanner;

public class Home3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какое животное вас интересует");
        int animal = scanner.nextInt();
         if (animal == 1){
            System.out.println("Это кошка");
            System.out.println("Мяу-мяу");
        }else if (animal == 2){
            System.out.println("Это собака");
            System.out.println("Гав-гав");
        }else if (animal == 3){
            System.out.println("Это утка");
            System.out.println("Кря-кря");
        }else if (animal == 4){
            System.out.println("Это корова");
            System.out.println("Муууу");
        }else if (animal == 5){
            System.out.println("Это коза");
            System.out.println("Бееее");
        }else if (animal == 6){
            System.out.println("Это кукушка");
            System.out.println("Ку-ку");
        }else if (animal == 7){
            System.out.println("Это петух");
            System.out.println("Кукареку");
        }else if (animal == 8){
            System.out.println("Это свинья");
            System.out.println("Хрю-хрю");
        }else if (animal == 9){
            System.out.println("Это ежик");
            System.out.println("Фыр-фыр");
        }else if (animal == 10){
            System.out.println("Это рыба");
            System.out.println("Она молчит");
        }else if (animal > 10){
            System.out.println("Я не знаю это животное");
        }else if (animal < 1){
             System.out.println("Я не знаю это животное");
         }
    }
}
