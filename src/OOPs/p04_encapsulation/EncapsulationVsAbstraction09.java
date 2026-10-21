package OOPs.p04_encapsulation;

class Bank09 {
    private double balance = 5000;
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }
    public double getBalance() {
        return balance;
    }
}
public class EncapsulationVsAbstraction09 {
    public static void main(String[] args) {
        Bank09 b = new Bank09();
        b.deposit(1000);
        System.out.println(b.getBalance());
    }
}

//Output:

//6000.0
