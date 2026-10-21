package OOPs.p06_polymorphism;
// 1. Runtime polymorphism

class Parent03 {
    void show() {
        System.out.println("Parent");
    }
}
class Child03 extends Parent03 {
    @Override
    void show() {
        System.out.println("Child");
    }
}
public class MethodOverriding03 {
    public static void main(String[] args) {
        Parent03 p = new Child03();
        p.show();
    }
}

//Output:

//Child