package practice.oops;

public class oops7 {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.display();

    }
}

class Student {
    int studentId;
    String name;
    String course;

    Student() {
        studentId = 1;
        name = "Chirag";
        course = "Java";

        System.out.println("Student object created");
    }

    void display () {
        System.out.printf("StudentId: %d\n", studentId);
        System.out.printf("name: %s\n", name);
        System.out.printf("course: %s\n", course);
    }
}