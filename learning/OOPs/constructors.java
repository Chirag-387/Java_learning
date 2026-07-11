package learning.OOPs;

public class constructors {
    public static void main(String[] args) {
        
        // Constructors -> A special method to initialize objects. You can pass the arguments to a constructor and set up initial values.

        Student student1 = new Student("Sherif", 33, 3.3);
        Student student2 = new Student("Romin", 47, 4.0);

        // System.out.println(student1.name);
        // System.out.println(student2.name);

        student1.study();
        student2.study();

    }
}
