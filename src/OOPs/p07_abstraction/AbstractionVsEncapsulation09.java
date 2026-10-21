package OOPs.p07_abstraction;

abstract class Bank09 {
    private double balance = 1000;
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }
    public double getBalance() {
        return balance;
    }
    abstract void accountType();
}
class SavingsAccount09 extends Bank09 {
    @Override
    void accountType() {
        System.out.println("Savings Account");
    }
}
public class AbstractionVsEncapsulation09 {
    public static void main(String[] args) {
        Bank09 b = new SavingsAccount09();
        b.deposit(500);
        b.accountType();
        System.out.println("Balance: " + b.getBalance());
    }
}

//Output:

//Savings Account
//Balance: 1500.0

// 1. Interview difference:

// 1. Abstraction: Exposes essential behavior while hiding implementation details.
// 2. Encapsulation: Protects internal state and controls access to it.