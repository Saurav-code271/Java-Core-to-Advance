package OOPs.p04_encapsulation;

class BankAccount10 {
    private final String accountHolder;
    private double balance;
    BankAccount10(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        if (initialBalance >= 0) this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
        else System.out.println("Invalid withdrawal");
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public double getBalance() {
        return balance;
    }
}
public class EncapsulationInterviewDemo10 {
    public static void main(String[] args) {
        BankAccount10 a = new BankAccount10("Saurav", 5000);
        a.deposit(2000);
        a.withdraw(1500);
        System.out.println(a.getAccountHolder());
        System.out.println("Balance: " + a.getBalance());
        a.withdraw(10000);
    }
}

// Output:

//Saurav
//Balance: 5500.0
//Invalid withdrawal


// 1. Key point: This combines private fields, constructor initialization, getters, validation, deposits, and withdrawals.