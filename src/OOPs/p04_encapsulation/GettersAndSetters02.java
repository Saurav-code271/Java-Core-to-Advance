package OOPs.p04_encapsulation;

class Employee02 {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
public class GettersAndSetters02 {
    public static void main(String[] args) {
        Employee02 e = new Employee02();
        e.setName("Rahul");
        System.out.println(e.getName());
    }
}

//Output:

// Rahul