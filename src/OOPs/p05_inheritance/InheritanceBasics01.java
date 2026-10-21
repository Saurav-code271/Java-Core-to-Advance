package OOPs.p05_inheritance;

class Animal01 {
    void eat() {
        System.out.println("Animal eats");
    }
}
class Dog01 extends Animal01 {
    void bark() {
        System.out.println("Dog barks");
    }
}
public class InheritanceBasics01 {
    public static void main(String[] args) {
        Dog01 d = new Dog01();
        d.eat();
        d.bark();
    }
}

//Output:

// Animal eats
//Dog barks