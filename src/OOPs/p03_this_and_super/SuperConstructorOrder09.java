package OOPs.p03_this_and_super;

class Animal09 {
    Animal09() {
        System.out.println("Animal constructor");
    }
}
class Dog09 extends Animal09 {
    Dog09() {
        super();
        System.out.println("Dog constructor");
    }
}
public class SuperConstructorOrder09 {
    public static void main(String[] args) {
        new Dog09();
    }
}

// Output:

// Animal constructor
//Dog constructor

// 2, Key point: The parent constructor executes before the child constructor. Java inserts an implicit
// super() if a constructor has no explicit this(...) or super(...) call and the parent has an accessible no-argument constructor.
