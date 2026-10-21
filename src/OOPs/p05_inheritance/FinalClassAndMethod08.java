package OOPs.p05_inheritance;

class Parent08 {
    final void display() {
        System.out.println("Final method");
    }
}
class Child08 extends Parent08 {
    // void display() {} // Compile-time error: cannot override final method
}
public class FinalClassAndMethod08 {
    public static void main(String[] args) {
        new Child08().display();
    }
}

//Output:

// Final method

// 1. Key point:

// 1. A final method cannot be overridden.
// 2. A final class cannot be extended.
// 3. A final method can still be inherited and called.
