package learning;

public class loops {
    public static void main(String[] args) {

        // while loop -> repeats a loop forover until the condition remains true.args

        // Scanner scanner = new Scanner(System.in);

        // String name = "";

        // while(name.isEmpty()) {
        //     System.out.print("Enter your name: ");
        //     name = scanner.nextLine();
        // }

        // System.out.printf("Your name is %s", name);

        // scanner.close();


        // do while loop -> first prints and then check the condition.

        // Scanner scanner = new Scanner(System.in);

        // int age = 0;

        // do { 
        //     System.out.println("Your age can't be negative.");
        //     System.out.print("Enter your age: ");
        //     age = scanner.nextInt();
        // } while (age < 0);
        // System.out.printf("Your age is %d years old.", age);

        // scanner.close();


        // for loop -> executes a loop for a certain nummber of times.

        // for (int i = 0; i < 10; i++) {
        //     System.out.println("Hello");
        // }


        // nested loops -> loop inside a loop.

        for(int i = 0; i <= 5; i++) {
            for(int j = 0; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
