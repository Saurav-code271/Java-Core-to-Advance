package OOPs.p09_object_class_methods;
// 1. Topics covered:

// 1. toString()
// 2. equals()
// 3. hashCode()
// 4. getClass()
// 5. Object class reference and polymorphism
// 6. == vs equals()
// 7. Overriding equals() and hashCode() together

class Student01 {
    int id;
    String name;

    Student01(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class ObjectClassPartOne01 {
    public static void main(String[] args) {
        Student01 s1 = new Student01(101, "Saurav");
        Student01 s2 = new Student01(102, "Rahul");

        // 1. toString()
        System.out.println(s1);

        // 2. getClass()
        System.out.println(s1.getClass().getName());

        // 3. == compares references
        Student01 s3 = s1;
        System.out.println(s1 == s3);

        // 4. equals() without overriding
        System.out.println(s1.equals(s2));

        // 5. Object class reference
        Object obj = s1;
        System.out.println(obj.toString());
    }
}

//Output:

//Student{id=101, name='Saurav'}
//OOPs.p09_object_class_methods.Student01
//true
//false
//Student{id=101, name='Saurav'}
