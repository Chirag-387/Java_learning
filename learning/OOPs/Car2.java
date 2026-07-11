package learning.OOPs;

public class Car2 {
 
    String model;
    String color;

    Car2(String model, String color) {

        this.model = model;
        this.color = color;

    }

    void drive() {
        System.out.printf("You drive the %s %s.\n", this.color, this.model);
    }

}