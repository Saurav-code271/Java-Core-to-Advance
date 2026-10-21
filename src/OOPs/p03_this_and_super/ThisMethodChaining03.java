package OOPs.p03_this_and_super;

class Calculator03 {
    int value;
    Calculator03 setValue(int value) {
        this.value = value;
        return this;
    }
    void display() {
        System.out.println("Value: " + value);
    }
}
public class ThisMethodChaining03 {
    public static void main(String[] args) {
        new Calculator03().setValue(50).display();
    }
}

// Output:
//Value: 50
