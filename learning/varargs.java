package learning;

public class varargs {
    public static void main(String[] args) {

        /*
        
        varargs -> allow a method to accept varying numbers of arguments makes method
                    more flexible, no need for overload methods .
                    Java will pack the arguments in an array
                    use -> "..." (ellipsis)
        
        */

        System.out.println(add(1, 2, 34, 2, 23 , 1));

        System.out.println(average(1, 2, 34, 2, 23 , 1));

        System.out.println(average());

    }

    static int add(int... numbers) {
        
        int sum = 0;
        
        for(int number: numbers) {
            sum += number;
        }

        return sum;

    }

    static double average(double... numbers) {

        double sum = 0;
        double average = 0;

        if(numbers.length == 0) {
            return 0;
        }

        for(double number: numbers) {
            sum += number;
        }

        average = (double) sum / numbers.length;

        return average;

    }


}
