package learning.OOPs;

public abstract class shape {
 
    abstract double area(); // ABSTRACT

    void display() { // CONCRETE METHOD
        System.out.println("This is a shape.");
    }

}