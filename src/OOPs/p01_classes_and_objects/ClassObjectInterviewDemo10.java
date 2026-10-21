package OOPs.p01_classes_and_objects;
// 1. A short interview-style example that combines classes, objects, fields, and methods.

class Rectangle10 {
    int length;
    int width;

    int calculateArea() {
        return length * width;
    }
}
public class ClassObjectInterviewDemo10 {
    public static void main(String[] args) {
        Rectangle10 rectangle = new Rectangle10();

        rectangle.length = 10;
        rectangle.width = 5;

        System.out.println("Area: " + rectangle.calculateArea());
    }
}

//Output:

//Area: 50

// 2. Concept: The Rectangle10 class defines the data and behavior.
// rectangle refers to an object whose dimensions determine the calculated area.

