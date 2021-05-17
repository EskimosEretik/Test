public class Task7 {
    public static void main(String[] args) {
        double s = 100;
        double p = 3;
        for (int i=0;i<2;i++){
            s= s + s * p / 100;
        }
        System.out.println(s);
    }
}
