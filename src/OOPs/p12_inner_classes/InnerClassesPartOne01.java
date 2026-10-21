package OOPs.p12_inner_classes;
// 1. Topics covered:

// 1. Member inner class
// 2. Static nested class
// 3. Local inner class
// 4. Anonymous inner class
// 5. Accessing outer-class members
// 6. When to use each type


// 1. Member inner class
class Outer01 {
    private String message = "Hello from outer class";

    class Inner {
        void display() {
            System.out.println(message);
            System.out.println("Member inner class");
        }
    }
}

// 2. Static nested class
class Outer02 {
    static String message = "Static nested class";

    static class Nested {
        void display() {
            System.out.println(message);
        }
    }
}

// 3. Inner class accessing outer object
class Laptop01 {
    String brand = "Dell";

    class Processor {
        void display() {
            System.out.println("Laptop brand: " + Laptop01.this.brand);
        }
    }
}

public class InnerClassesPartOne01 {
    public static void main(String[] args) {
        // Member inner class
        Outer01 outer = new Outer01();
        Outer01.Inner inner = outer.new Inner();
        inner.display();

        // Static nested class
        Outer02.Nested nested = new Outer02.Nested();
        nested.display();

        // Inner class using outer object
        Laptop01 laptop = new Laptop01();
        Laptop01.Processor processor = laptop.new Processor();
        processor.display();
    }
}

//Output:

//Hello from outer class
//Member inner class
//Static nested class
//Laptop brand: Dell