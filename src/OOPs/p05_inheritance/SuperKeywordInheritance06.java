package OOPs.p05_inheritance;

class Parent06 {
    String name = "Parent";
    void show() {
        System.out.println("Parent method");
    }
}
class Child06 extends Parent06 {
    String name = "Child";
    void display() {
        System.out.println(super.name);
        super.show();
    }
}
public class SuperKeywordInheritance06 {
    public static void main(String[] args) {
        new Child06().display();
    }
}

//output:

//Parent
//Parent method

