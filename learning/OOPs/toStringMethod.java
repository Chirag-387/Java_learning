package learning.OOPs;

public class toStringMethod {
    public static void main(String[] args) {
        
        /*
        
        .toString() -> Method inherited from a object class.
                       Used to return a string representation of an object.
                       By default, it returns a hash code as a unique identifier.
                       It can be overridden to provide meaningful details.
        
        */

        Car3 car1 = new Car3("Ford", "Mustang", 2025, "White");
        Car3 car2 = new Car3("BMW", "S series", 2026, "White");

        System.out.println(car1);
        System.out.println(car2);

    }
}
