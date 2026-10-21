package OOPs.p03_this_and_super;

class Parent07 {
    String name = "Parent";
}
class Child07 extends Parent07 {
    String name = "Child";
    void display() {
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
public class ThisVsSuper07 {
    public static void main(String[] args) {
        new Child07().display();
    }
}

//Output:

// Child
//Parent

// 2. Key point:
// 1. this refers to the current object.
// 2. - super accesses the parent-class version of an inherited member.