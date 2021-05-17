public class Task10 {

    public static void main(String[] args) {
       final double height = 180;
       final double weight = 80;

       double idealWeight = height - 110;

       if(weight > idealWeight){
           System.out.println("Вам нужно сбросить " + (weight - idealWeight));
       }else if(weight < idealWeight){
           System.out.println("Вам нужно набрать " + (idealWeight - weight));
       }else{
           System.out.println("Ваш вес идеален");
       }

    }
}
