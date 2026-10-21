package OOPs.p05_inheritance;

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
}
public class InheritanceMethodOverriding05 {
    public static void main(String[] args) {
        new Parent05().show();
        new Child05().show();
    }
}

//Output:

//Parent method
//Child method

// 1. Quick revision:

// 1. Single: One child inherits from one parent.
// 2. Multilevel: A class inherits through a chain of classes.
// 3. Hierarchical: Multiple child classes inherit from one parent.
// 4. Overriding: A child class provides its own implementation of an inherited instance method.