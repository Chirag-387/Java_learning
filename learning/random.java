package learning;
import java.util.Random;

public class random {
    public static void main(String[] args) {

        Random random = new Random();
        
        int num1;
        double num2;
        boolean what;

        num1 = random.nextInt(1, 100); /*  inside brackets of nextInt represents the bounds like starting 1 and ending 100, so the number is ;
         100 < number <= 1  but never 100 as ending bound is exclusive whereas starting bound is inclusive.  */

         System.out.println(num1);

         num2 = random.nextDouble(1, 10);
         System.out.println(num2);

         what = random.nextBoolean();
         System.out.println(what);

    }
}
