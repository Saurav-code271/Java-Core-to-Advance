package OOPs.p05_inheritance;

class Parent07 {
    Parent07() {
        System.out.println("Parent constructor");
    }
}
class Child07 extends Parent07 {
    Child07() {
        System.out.println("Child constructor");
    }
}
public class InheritanceConstructorOrder07 {
    public static void main(String[] args) {
        new Child07();
    }
}

//Output:

//Parent constructor
//Child constructor

// 1. Key point: The parent constructor executes before the child constructor.
