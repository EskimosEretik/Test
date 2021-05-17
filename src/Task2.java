public class Task2 {
    public static void main(String[] args) {
        int a = 741;
        int s = a % 100;
        int b = (a - s)/100;
        int d = s%10;
        int c = (s - d)/10;
        System.out.println(b+c+d);
    }
}
