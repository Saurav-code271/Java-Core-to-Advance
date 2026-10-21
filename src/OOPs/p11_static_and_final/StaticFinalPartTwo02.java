package OOPs.p11_static_and_final;

// 1. Final variable
class Configuration02 {
    final int MAX_USERS = 100;

    void display() {
        System.out.println("Maximum users: " + MAX_USERS);
    }
}

// 2. Static final constant
class Constants02 {
    static final double PI = 3.14159;
}

// 3. Final method cannot be overridden
class Parent02 {
    final void show() {
        System.out.println("Final method in parent");
    }
}

class Child02 extends Parent02 {
    // Overriding show() here would cause a compile-time error.
}

// 4. Final class cannot be extended
final class Security02 {
    void verify() {
        System.out.println("Security verified");
    }
}

// 5. Final reference: reference cannot change,
// but the object's state may still change.
class Box02 {
    int value;
}

public class StaticFinalPartTwo02 {
    public static void main(String[] args) {
        Configuration02 config = new Configuration02();
        config.display();

        System.out.println("PI: " + Constants02.PI);

        Child02 child = new Child02();
        child.show();

        Security02 security = new Security02();
        security.verify();

        final Box02 box = new Box02();
        box.value = 50;
        System.out.println(box.value);

        // box = new Box02(); // Compile-time error
    }
}

//Output:

//Maximum users: 100
//PI: 3.14159
//Final method in parent
//Security verified
//50

// 1. Key points for interviews:

//    Keyword	                 Meaning

// 1. static variable	         One shared copy per class
// 2. static method	             Can be called using the class name
// 3. Static block	             Executes when the class is initialized
// 4. final variable	         Can be assigned only once
// 5. final method	             Cannot be overridden
// 6. final class	             Cannot be extended
// 7. static final	             Commonly used for constants

// 2. Important: A final object reference cannot point to a different object,
// but the referenced object's fields can still change if they are mutable.
