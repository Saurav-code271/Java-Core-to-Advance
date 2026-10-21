package OOPs.p04_encapsulation;

class Student05 {
    private final int rollNo;
    Student05(int rollNo) {
        this.rollNo = rollNo;
    }
    public int getRollNo() {
        return rollNo;
    }
}
public class ReadOnlyClass05 {
    public static void main(String[] args) {
        Student05 s = new Student05(101);
        System.out.println(s.getRollNo());
    }
}

//Output:

//101