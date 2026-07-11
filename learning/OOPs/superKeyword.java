package learning.OOPs;

public class superKeyword {
    public static void main(String[] args) {
        
        // super -> Refers to the parent class (superClass -> subClass), used in constructors and method overiding, Calls the parent constructor to intialize attributes.

        // Person person = new Person("Harry", "Potter");

        // person.showName();

        // Student2 student = new Student2("Harry", "Potter", 4.0);

        // student.showName();

        // System.out.println(student.gpa);


        // Method overriding -> When a subClass provides its own implementation of a method that is already defined. Allows for reusability and give specific implementations.

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();

    }
}
