package OOPs.p07_abstraction;
// 1. Abstract method rules

abstract class Shape07 {
    abstract double area();
}
class Circle07 extends Shape07 {
    double radius;
    Circle07(double radius) {
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
public class AbstractMethodRules07 {
    public static void main(String[] args) {
        Shape07 s = new Circle07(2);
        System.out.printf("Area: %.2f%n", s.area());
    }
}

//Output:

//Area: 12.57

// 2. Key rules:

// 1. An abstract method has no body.
// 2. A class containing an abstract method must be declared abstract.
// 3. A concrete subclass must implement inherited abstract methods.
// 4. Abstract methods cannot be private, static, or final.