package OOPs.p03_this_and_super;

class Student01 {
    String name;
    Student01(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Name: " + this.name);
    }
}
public class ThisKeywordBasics01 {
    public static void main(String[] args) {
        Student01 s = new Student01("Saurav");
        s.display();
    }
}

// Output:

//Name: Saurav