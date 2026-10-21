package OOPs.p06_polymorphism;

class Display09 {
    void show(int x) {
        System.out.println("int: " + x);
    }
    void show(double x) {
        System.out.println("double: " + x);
    }
    void show(String x) {
        System.out.println("String: " + x);
    }
}
public class OverloadingResolution09 {
    public static void main(String[] args) {
        Display09 d = new Display09();
        d.show(10);
        d.show(10.5);
        d.show("Java");
    }
}

//Output:

// int: 10
//double: 10.5
//String: Java

// 1. Key point: Java selects the applicable overloaded method at compile time based on the argument types.
// An ambiguous call, such as passing null to two unrelated reference-type overloads, can cause a compile-time error.