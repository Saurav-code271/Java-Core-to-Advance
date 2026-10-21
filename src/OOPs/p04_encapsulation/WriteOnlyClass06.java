package OOPs.p04_encapsulation;

class Password06 {
    private String password;
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean verify(String input) {
        return password.equals(input);
    }
}
public class WriteOnlyClass06 {
    public static void main(String[] args) {
        Password06 p = new Password06();
        p.setPassword("Java123");
        System.out.println(p.verify("Java123"));
        System.out.println(p.verify("Wrong"));
    }
}

// Output:

//true
//false

//  1. Key point: A write-only property pattern allows setting a value without providing a getter.
//  This example verifies the password without exposing its stored value. Real applications should store password hashes, not plaintext passwords.
