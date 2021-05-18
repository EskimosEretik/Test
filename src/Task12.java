import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int pie = 0;
        for (int i = 0; i < count; i++) {
            pie++;
        }
        int pack = 0;

        System.out.println("если 100% учеников весят меньше 30кг: ");
        pack = (int) Math.ceil((pie * 0.2) / 0.9);
        System.out.println(pack + " " + pie * 2);

        System.out.println("если 60% учеников весят меньше 30кг: ");
        pack = (int) Math.ceil((pie * 0.6 * 0.2) / 0.9);
        System.out.println(pack + " " + (pie + (int) Math.ceil(pie * 0.6)));

        System.out.println("если 1% учеников весят меньше 30кг: ");
        pack = (int) Math.ceil((pie * 0.01 * 0.2) / 0.9);
        System.out.println(pack + " " + (pie + (int) Math.ceil(pie * 0.01)));
    }
}
