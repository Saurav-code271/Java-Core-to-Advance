package OOPs.p02_constructors;
// 1. Constructor overloading means defining multiple constructors with different parameter lists.

class Product03 {
    String name;
    double price;

    Product03() {
        name = "Unknown";
        price = 0.0;
    }
    Product03(String name) {
        this.name = name;
        price = 100.0;
    }
    Product03(String name, double price) {
        this.name = name;
        this.price = price;
    }
    void display() {
        System.out.println(name + " - " + price);
    }
}
public class ConstructorOverloading03 {
    public static void main(String[] args) {
        Product03 p1 = new Product03();
        Product03 p2 = new Product03("Keyboard");
        Product03 p3 = new Product03("Mouse", 599.0);

        p1.display();
        p2.display();
        p3.display();
    }
}

//Output:

//Unknown - 0.0
//Keyboard - 100.0
//Mouse - 599.0

// 2. Interview point: Constructors can be overloaded, but they cannot be overridden like ordinary instance methods.

