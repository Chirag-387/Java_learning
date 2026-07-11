package learning.OOPs;

public class arraysOfObjects {
    public static void main(String[] args) {
        
        // Car2 car1 = new Car2("Mustang", "Red");
        // Car2 car2 = new Car2("BMW", "White");
        // Car2 car3 = new Car2("Audi", "Black");

        // Car2[] cars = new Car2[3];
        
        //OR

        // Car2[] cars = {car1, car2, car3};

        // for(int i = 0; i < cars.length; i++) {
        //     cars[i].drive();
        // }

        // OR

        // for(Car2 car: cars) {
        //     car.drive();
        // }

        Car2[] cars = {new Car2("Mustang", "Red"),
                        new Car2("BMW", "White"),
                        new Car2("Audi", "Black")};

        for(Car2 car: cars) {
            car.color = "black";
            car.drive();
        }

    }
}