package learning.OOPs;

public class Student {
    
    String name;
    int age;
    double gpa;
    boolean isEnrolled;


    // setting up a constructor.
    Student(String name, int age,   double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    void study() {
        System.out.printf("%s is studying.\n", this.name);
    }

}
