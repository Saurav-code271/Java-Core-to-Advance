package CollectionFramework.p02_list.ArrayList;
// 1. Use set(index, value) to replace an existing element.

import java.util.ArrayList;

public class ArrayListUpdateElements04 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Aman");
        students.add("Rohit");

        System.out.println("Before: " + students);

        students.set(1, "Saurav");

        System.out.println("After: " + students);
    }
}

// 2. Output:
// Before: [Rahul, Aman, Rohit]
// After: [Rahul, Saurav, Rohit]

// 3. set() replaces an element; add(index, value) inserts a new element and shifts later elements to the right.


