package OOPs.p04_encapsulation;

class BankAccount03 {
    private double balance;
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
        else System.out.println("Invalid amount");
    }
    public double getBalance() {
        return balance;
    }
}
public class DataValidation03 {
    public static void main(String[] args) {
        BankAccount03 b = new BankAccount03();
        b.deposit(1000);
        b.deposit(-200);
        System.out.println("Balance: " + b.getBalance());
    }
}

//Output:

//Invalid amount
//Balance: 1000.0