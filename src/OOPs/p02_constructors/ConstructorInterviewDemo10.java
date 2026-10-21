package OOPs.p02_constructors;
// 1. Combine constructor overloading and initialization in one interview-style example.

class BankAccount10 {
    String holder;
    double balance;

    BankAccount10(String holder) {
        this(holder, 0.0);
    }

    BankAccount10(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    void display() {
        System.out.println("Holder: " + holder);
        System.out.println("Balance: " + balance);
    }
}

public class ConstructorInterviewDemo10 {
    public static void main(String[] args) {
        BankAccount10 a1 = new BankAccount10("Saurav");
        BankAccount10 a2 = new BankAccount10("Aman", 5000.0);

        a1.display();
        a2.display();
    }
}

//Output:

//Holder: Saurav
//Balance: 0.0
//Holder: Aman
//Balance: 5000.0

