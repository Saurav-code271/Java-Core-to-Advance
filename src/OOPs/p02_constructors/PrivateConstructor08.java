package OOPs.p02_constructors;
// 1. A private constructor prevents other classes from directly creating objects through that constructor.
// A common use is a utility class.

class Utility08 {
    private Utility08() {
        System.out.println("Private constructor called");
    }

    static void greet() {
        System.out.println("Hello from utility class");
    }
}

public class PrivateConstructor08 {
    public static void main(String[] args) {
        Utility08.greet();

        // This would not compile:
        // Utility08 obj = new Utility08();
    }
}

// Output:

//Hello from utility class

// 2. Key concept: A private constructor is accessible within its own class, but not directly from unrelated classes.
// It is often used to prevent instantiation of utility classes.
