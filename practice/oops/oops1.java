package practice.oops;

public class oops1 {
    public static void main(String[] args) {
        
        // Q1

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        // s1
        s1.studentId = 1;
        s1.name = "Chirag";
        s1.course = "Java";

        //s2
        s2.studentId = 2;
        s2.name = "Random1";
        s2.course = "Cloud Computing";

        //s3
        s3.studentId = 3;
        s3.name = "Random2";
        s3.course = "DBMS";

        // printing s1
        System.out.println("Student1");
        System.out.println(s1.studentId);
        System.out.println(s1.name);
        System.out.println(s1.course);

        System.out.println();

        // printing s2
        System.out.println("Student2");
        System.out.println(s2.studentId);
        System.out.println(s2.name);
        System.out.println(s2.course);

        System.out.println();

        // printing s3
        System.out.println("Student3");
        System.out.println(s3.studentId);
        System.out.println(s3.name);
        System.out.println(s3.course);

    }
}

class Student {
    int studentId;
    String name;
    String course;
}