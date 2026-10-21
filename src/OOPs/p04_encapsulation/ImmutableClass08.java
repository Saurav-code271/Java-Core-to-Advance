package OOPs.p04_encapsulation;

final class Student08 {
    private final String name;
    private final int age;
    Student08(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
public class ImmutableClass08 {
    public static void main(String[] args) {
        Student08 s = new Student08("Saurav", 22);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}

// Output:

// Saurav
//22

// 1. Key point: This class is immutable because its fields are private final, there are no setters, and the class is final.
// Its fields are immutable types (String and int).