package CollectionFramework.p03_set.p03_linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetSearchMethods05 {
    public static void main(String[] args) {
        LinkedHashSet<String> students =
                new LinkedHashSet<>();

        students.add("Saurav");
        students.add("Rahul");
        students.add("Aman");

        System.out.println(students.contains("Saurav"));
        System.out.println(students.contains("Priya"));
        System.out.println("Size: " + students.size());
        System.out.println("Empty: " + students.isEmpty());
    }
}

// Output:

// true
// false
// Size: 3
// Empty: false
