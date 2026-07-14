package practice.methods;

public class methods1 {
    public static void main(String[] args) {
        
        helloJava();

        welcome();

        morning();

        afternoon();

        evening();

        displayName("Chirag");

        oneToTen();

        tableOf5();

        evenFrom2To20();

        oddNumber(50);

        drawLine();
        drawLine();
        drawLine();
        drawLine();
        drawLine();

        rightTriangle();

    }

    static void helloJava() {
        System.out.println("Hello, Java.");
    }

    static void welcome() {
        System.out.println("Welcome to the Java Programming.");
    }

    static void morning() {
        System.out.println("Good morning!!");
    }

    static void afternoon() {
        System.out.println("Good afternoon!!");
    }

    static void evening() {
        System.out.println("Good evening!!");
    }

    static void displayName(String name) {
        System.out.printf("Name: %s\n", name);
    }

    static void oneToTen() {
        for(int i = 0; i < 10; i++) {
            System.out.printf("%d ", (i + 1));
        }
        System.out.println();
    }

    static void tableOf5() {
        for(int i = 0; i < 10; i++) {
            System.out.printf("%d ", ((i + 1) * 5));
        }
        System.out.println();
    }

    static void evenFrom2To20() {
        for(int i = 2; i <= 20; i += 2) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    static void oddNumber(int n) {
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                System.out.printf("%d ", i);
            }
        }
        System.out.println();
    }

    static void drawLine() {
        System.out.println("-----------");
    }

    static void rightTriangle() {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

}