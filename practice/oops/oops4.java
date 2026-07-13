package practice.oops;

public class oops4 {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student();

        // s1
        s1.studentId = 1;
        s1.name = "Chirag";
        s1.course = "Java";

        // s2
        s2.studentId = 2;
        s2.name = "Random";
        s2.course = "Cloud Computing";

        s1.display();
        System.out.println();
        s2.display();

    }
}

class Student {
    int studentId;
    String name;
    String course;

    void display() {
        System.out.printf("StudentID: %d\n", studentId);
        System.out.printf("name: %s\n", name);
        System.out.printf("course: %s\n", course);
    }
}