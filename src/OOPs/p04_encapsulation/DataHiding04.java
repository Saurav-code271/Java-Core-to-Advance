package OOPs.p04_encapsulation;

class Account04 {
    private double balance = 5000;
    public void showBalance() {
        System.out.println("Balance: " + balance);
    }
}
public class DataHiding04 {
    public static void main(String[] args) {
        Account04 a = new Account04();
        a.showBalance();
        // a.balance = 10000; // Compile-time error
    }
}

//Output:

//Balance: 5000.0