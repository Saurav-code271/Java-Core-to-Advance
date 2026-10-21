package OOPs.p01_classes_and_objects;
// 1. An array can store multiple object references.

class Book09 {
    String title;

    Book09(String title) {
        this.title = title;
    }
}
public class ArrayOfObjectsDemo09 {
    public static void main(String[] args) {
        Book09[] books = {
                new Book09("Java"),
                new Book09("DSA"),
                new Book09("SQL")
        };
        for (Book09 book : books) {
            System.out.println(book.title);
        }
    }
}
// Output:

//Java
//DSA
//SQL

// 2. Concept: The array stores references to three separate Book09 objects. This example uses a constructor,
// which we'll study properly in Package 02.

