package OOPs.p03_this_and_super;

class Animal04 {
    String type = "Animal";
}
class Dog04 extends Animal04 {
    String type = "Dog";
    void display() {
        System.out.println(type);
        System.out.println(super.type);
    }
}
public class SuperKeywordBasics04 {
    public static void main(String[] args) {
        new Dog04().display();
    }
}

// Output:
//Dog
//Animal

// 1. Key point: super accesses a parent-class member hidden by a child-class member.
