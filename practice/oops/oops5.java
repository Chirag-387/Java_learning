package practice.oops;

public class oops5 {
    public static void main(String[] args) {
        
    calculator c = new calculator();

    c.add(10, 72);

    }
}

class calculator {
    void add(int a, int b) {
        System.out.printf("The sum is %d.\n", (a + b));
    }
}