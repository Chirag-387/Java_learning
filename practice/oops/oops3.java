package practice.oops;

public class oops3 {
    public static void main(String[] args) {
        
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        Mobile m3 = new Mobile();
        Mobile m4 = new Mobile();
        Mobile m5 = new Mobile();

        // m1
        m1.brand = "A";
        m1.model = "A";
        m1.storage = 10;

        // m2
        m2.brand = "B";
        m2.model = "B";
        m2.storage = 12;

        // m3
        m3.brand = "C";
        m3.model = "C";
        m3.storage = 12;

        // m4
        m4.brand = "D";
        m4.model = "D";
        m4.storage = 13;

        // m5
        m5.brand = "E";
        m5.model = "E";
        m5.storage = 14;

        // printing m1
        System.out.println(m1.brand);
        System.out.println(m1.model);
        System.out.println(m1.storage);

        System.out.println();

        // printing m2
        System.out.println(m2.brand);
        System.out.println(m2.model);
        System.out.println(m2.storage);

        System.out.println();

        // printing m3
        System.out.println(m3.brand);
        System.out.println(m3.model);
        System.out.println(m3.storage);

        System.out.println();

        // printing m4
        System.out.println(m4.brand);
        System.out.println(m4.model);
        System.out.println(m4.storage);

        System.out.println();

        // printing m5
        System.out.println(m5.brand);
        System.out.println(m5.model);
        System.out.println(m5.storage);

    }
}

class Mobile {
    String brand;
    String model;
    int storage;
}