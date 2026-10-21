package OOPs.p03_this_and_super;

class Parent05 {
    void show() {
        System.out.println("Parent method");
    }
}
class Child05 extends Parent05 {
    @Override
    void show() {
        System.out.println("Child method");
    }
    void display() {
        show();
        super.show();
    }
}
public class SuperAccessParentMethods05 {
    public static void main(String[] args) {
        new Child05().display();
    }
}

// Output:
//Child method
//Parent method

// 1. Key point: super.show() explicitly calls the parent implementation.
// 2. Important Java rule: this() or super() must be the first statement in a constructor.
// You cannot explicitly call both in the same constructor.