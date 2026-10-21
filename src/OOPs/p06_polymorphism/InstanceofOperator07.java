package OOPs.p06_polymorphism;

class Animal07 {}
class Dog07 extends Animal07 {
    void bark() {
        System.out.println("Dog barks");
    }
}
public class InstanceofOperator07 {
    public static void main(String[] args) {
        Animal07 a = new Dog07();
        System.out.println(a instanceof Animal07);
        System.out.println(a instanceof Dog07);
        if (a instanceof Dog07 d) {
            d.bark();
        }
    }
}

//Output:

//true
//true
//Dog barks

// 1. Key point: instanceof checks an object's runtime type.
// Pattern matching (a instanceof Dog07 d) is supported in modern Java versions.