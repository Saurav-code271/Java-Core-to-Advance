package OOPs.p01_classes_and_objects;
// 1. Two reference variables can point to the same object.

class Box04 {
    int value = 10;
}

public class ObjectReferenceDemo04 {
    public static void main(String[] args) {
        Box04 b1 = new Box04();
        Box04 b2 = b1;

        b2.value = 50;

        System.out.println(b1.value);
        System.out.println(b2.value);
    }
}

// Output:

//50
//50

// 2. Concept: b1 and b2 refer to the same Box04 object. Assigning b2 = b1 does not create a second object.
