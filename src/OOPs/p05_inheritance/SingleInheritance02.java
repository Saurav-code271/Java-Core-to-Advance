package OOPs.p05_inheritance;

class Person02 {
    String name = "Saurav";
}
class Student02 extends Person02 {
    void display() {
        System.out.println(name);
    }
}
public class SingleInheritance02 {
    public static void main(String[] args) {
        new Student02().display();
    }
}

//Output:

//Saurav