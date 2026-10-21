package OOPs.p04_encapsulation;

class Student01 {
    private String name = "Saurav";
    public String getName() {
        return name;
    }
}
public class EncapsulationBasics01 {
    public static void main(String[] args) {
        Student01 s = new Student01();
        System.out.println(s.getName());
    }
}

//Output

//Saurav
