package practice.oops;

public class oops9 {
    public static void main(String[] args) {
        
        car c1 = new car();

        c1.Brand = "Toyota";
        c1.Price = 5999.99;

        c1.display();

    }
}

class car {
    String Brand;
    double Price;

    void display() {
        System.out.printf("The brand of the car is %s.\n", Brand);
        System.out.printf("The price of the car is %.2f\n", Price);
    }

}