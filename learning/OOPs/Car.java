package learning.OOPs;


    public class Car {

        // All the features in this class are the attributes of the car.

        String make = "Ford";
        String model = "Mustang";
        int year = 2025;
        double price = 58000.99;
        boolean isRunning = false;

        void start() {
            isRunning = true;
            System.out.println("You start the engine.");
        }

        void stop() {
            isRunning = false;
            System.out.println("You stop the engine.");
        }

        void drive() {
            System.out.printf("You drive the %s.\n", model);
        }

        void brake() {
            System.out.printf("You brake the %s.\n", model);
        }

    }