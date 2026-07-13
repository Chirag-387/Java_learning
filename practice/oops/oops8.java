package practice.oops;

public class oops8 {
    public static void main(String[] args) {
        
        Book b1 = new Book();
        b1.display();

    }
}

class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "A";
        author = "B";
        price = 12.44;

        System.out.println("Book object created.");
    }

    void display() {
        System.out.printf("title: %s\n", title);
        System.out.printf("author: %s\n", author);
        System.out.printf("price: %f\n", price);
    }
}