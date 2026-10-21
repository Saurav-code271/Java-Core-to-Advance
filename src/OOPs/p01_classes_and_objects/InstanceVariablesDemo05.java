package OOPs.p01_classes_and_objects;
// 1. Instance variables receive default values if you don't initialize them explicitly.

class Data05 {
    int number;
    double price;
    boolean active;
    String text;
}

public class InstanceVariablesDemo05 {
    public static void main(String[] args) {
        Data05 data = new Data05();

        System.out.println(data.number);
        System.out.println(data.price);
        System.out.println(data.active);
        System.out.println(data.text);
    }
}

// Output:

//0
//0.0
//false
//null

// 2. Concept: Default values apply to instance fields. Local variables inside methods must be initialized before they are read.

