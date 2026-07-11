package learning.OOPs;

public class abstraction {
    public static void main(String[] args) {
        
        /*
        
        abstract -> used to define abstract classes and methods.
                    Abstraction is the process of hiding implementation details,
                    and showing only the essential features.
                    Abstract classes CAN'T be instantiated directly
                    Can conatin 'abstract' methods (which must be implmented)
                    Can contain 'concrete' methods (which are inherited)
        
        */

        circle circl1 = new circle(3);
        triangle triangle1 = new triangle(4, 5);
        rectangle rectangle1 = new rectangle(6, 7);

        circl1.display();
        triangle1.display();
        rectangle1.display();

        System.out.println(circl1.area());
        System.out.println(triangle1.area());
        System.out.println(rectangle1.area());

    }
}