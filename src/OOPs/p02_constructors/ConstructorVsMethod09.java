package OOPs.p02_constructors;
// 1. Compare a constructor with an ordinary method.

class Demo09 {
    Demo09() {
        System.out.println("Constructor executed");
    }

    void Demo09() {
        System.out.println("Method executed");
    }
}

public class ConstructorVsMethod09 {
    public static void main(String[] args) {
        Demo09 obj = new Demo09();
        obj.Demo09();
    }
}

// Output:

//Constructor executed
//Method executed

// 2. Notice that void Demo09() is a method because it has a return type. The constructor has no return type.

