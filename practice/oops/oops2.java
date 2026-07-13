package practice.oops;

public class oops2 {
    
    // Q2
    public static void main(String[] args) {
        book b1 = new book();
        book b2 = new book();
        book b3 = new book();
        book b4 = new book();

        // b1
        b1.title = "A";
        b1.author = "X";
        b1.price = 43.34;

        // b2
        b2.title = "B";
        b2.author = "Y";
        b2.price = 34.4;

        // b3
        b3.title = "C";
        b3.author = "Z";
        b3.price = 19.99;

        // b4
        b4.title = "D";
        b4.author = "ZXY";
        b4.price = 987.78;

        // printing b1
        System.out.println(b1.title);
        System.out.println(b1.author);
        System.out.println(b1.price);

        System.out.println();

        // printing b2
        System.out.println(b2.title);
        System.out.println(b2.author);
        System.out.println(b2.price);

        System.out.println();

        // printing b3
        System.out.println(b3.title);
        System.out.println(b3.author);
        System.out.println(b3.price);

        System.out.println();

        // printing b4
        System.out.println(b4.title);
        System.out.println(b4.author);
        System.out.println(b4.price);
        
    }
}

class book {
    String title;
    String author;
    double price;
}