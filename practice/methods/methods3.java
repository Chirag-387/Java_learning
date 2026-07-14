package practice.methods;

public class methods3 {
    public static void main(String[] args) {
 
        System.out.println(square(5));

        System.out.println(cube(5));

        System.out.println(maxNum(5, 10));

        System.out.println(minNum(5, 10));

        System.out.println(isPositive(-5));

        System.out.println(isPositive(5));

    }

    static int square(int n) {
        return (n * n);
    }

    static int cube(int n) {
        return (n * n * n);
    }

    static int maxNum(int a, int b) {
        int result = 0;
        if(a > b) {
            result = a;
        }
        else {
            result = b;
        }
        return result;
    }

    static int minNum(int a, int b) {
        int result = 0;
        if(a < b) {
            result = a;
        }
        else {
            result = b;
        }
        return result;
    }

    static boolean isPositive(int n) {
        boolean result;
        if(n >= 0) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }

    static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for(int i = 3; i <= Math.sqrt(n); i += 2) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    

}