package OOPs.p05_inheritance;

class LivingThing03 {
    void live() {
        System.out.println("Living");
    }
}
class Animal03 extends LivingThing03 {
    void eat() {
        System.out.println("Eating");
    }
}
class Dog03 extends Animal03 {
    void bark() {
        System.out.println("Barking");
    }
}
public class MultilevelInheritance03 {
    public static void main(String[] args) {
        Dog03 d = new Dog03();
        d.live();
        d.eat();
        d.bark();
    }
}

//Output:

// Living
//Eating
//Barking