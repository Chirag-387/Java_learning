package practice.oops;

public class oops6 {
    public static void main(String[] args) {
        
        Calculator c = new Calculator();

        int result = c.add(10, 97);

        System.out.println(result);

    }
}

class Calculator {
    int add(int a, int b) {
        return (a + b);
    }
}