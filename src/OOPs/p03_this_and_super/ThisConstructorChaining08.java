package OOPs.p03_this_and_super;

class Product08 {
    String name;
    int price;
    Product08() {
        this("Unknown");
    }
    Product08(String name) {
        this(name, 0);
    }
    Product08(String name, int price) {
        this.name = name;
        this.price = price;
    }
    void display() {
        System.out.println(name + " " + price);
    }
}
public class ThisConstructorChaining08 {
    public static void main(String[] args) {
        new Product08().display();
        new Product08("Laptop").display();
        new Product08("Phone", 20000).display();
    }
}

// Output:

//Unknown 0
//Laptop 0
//Phone 20000

// 1. Key point: this() lets one constructor call another constructor in the same class.
// Each constructor call must be its first statement.
