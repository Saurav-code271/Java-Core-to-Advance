package CollectionFramework.p03_set.p02_hashset;

import java.util.HashSet;

public class HashSetSearchMethods05 {
    public static void main(String[] args) {
        HashSet<String> students = new HashSet<>();

        students.add("Saurav");
        students.add("Rahul");
        students.add("Aman");

        System.out.println("Contains Saurav: "
                + students.contains("Saurav"));

        System.out.println("Contains Priya: "
                + students.contains("Priya"));

        System.out.println("Size: " + students.size());
        System.out.println("Empty: " + students.isEmpty());
    }
}

// Output:
// Contains Saurav: true
// Contains Priya: false
// Size: 3
// Empty: false

// 1. contains() typically takes \(O(1)\) average time, assuming a good distribution of hash codes.