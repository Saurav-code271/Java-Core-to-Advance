package OOPs.p02_constructors;
// 1. Use constructor parameters to initialize multiple instance variables.

class Book07 {
    String title;
    String author;
    double price;

    Book07(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class ConstructorWithInstanceVariables07 {
    public static void main(String[] args) {
        Book07 book = new Book07("Effective Java", "Joshua Bloch", 800.0);
        book.display();
    }
}

// Output:

//Title: Effective Java
//Author: Joshua Bloch
//Price: 800.0
