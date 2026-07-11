package learning.OOPs;

public class Student2 extends Person{
    
    double gpa;

    Student2(String first, String last, double gpa) {
        super(first, last); // this super refers to the parent and execute according to the parent class.
        this.gpa = gpa;
    }

}