package practice.oops;

public class oops10 {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student();

        // s1
        s1.name = "Chirag";
        s1.age = 19;

        // s2
        s2.name = "Rahul";
        s2.age = 20;

        // Displaying the records
        s1.display();
        s2.display();

    }
}

class Student {
    String name;
    int age;

    void display() {
        System.out.printf("Name: %s\n", name);
        System.out.printf("Age: %d\n", age);
    }

}