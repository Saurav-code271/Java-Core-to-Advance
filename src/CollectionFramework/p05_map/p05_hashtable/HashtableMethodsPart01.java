package CollectionFramework.p05_map.p05_hashtable;
// 1. Hashtable is a legacy class that stores key-value pairs, similar to HashMap.
// It is useful to learn for Java interviews because it highlights differences in synchronization, null handling, and modern alternatives.
// 2. This class covers insertion, retrieval, updating, searching, removal, and basic operations.

import java.util.Hashtable;

public class HashtableMethodsPart01 {
    public static void main(String[] args) {

        Hashtable<Integer, String> students = new Hashtable<>();

        // 1. Insert entries
        students.put(101, "Saurav");
        students.put(102, "Rahul");
        students.put(103, "Amit");

        System.out.println("Original table: " + students);

        // 2. Retrieve values
        System.out.println("Student 101: " + students.get(101));
        System.out.println("Missing key: " + students.get(110));
        System.out.println("Default value: "
                + students.getOrDefault(110, "Not Found"));

        // 3. Update an existing key
        students.put(102, "Priya");
        System.out.println("After update: " + students);

        // 4. Insert only if absent
        students.putIfAbsent(104, "Neha");
        students.putIfAbsent(101, "New Name");
        System.out.println("After putIfAbsent: " + students);

        // 5. Search
        System.out.println("Contains key 103: "
                + students.containsKey(103));
        System.out.println("Contains value Amit: "
                + students.containsValue("Amit"));

        // 6. Replace
        students.replace(104, "Anjali");
        students.replace(103, "Amit", "Ankit");
        System.out.println("After replace: " + students);

        // 7. Remove
        students.remove(102);
        System.out.println("After removing key 102: " + students);

        System.out.println("Conditional remove: "
                + students.remove(101, "Saurav"));

        // 8. Basic information
        System.out.println("Size: " + students.size());
        System.out.println("Is empty: " + students.isEmpty());

        // 9. Clear
        students.clear();
        System.out.println("After clear: " + students);
    }
}

// Output: The order may vary because Hashtable does not guarantee iteration order.

// Original table: {103=Amit, 102=Rahul, 101=Saurav}
// Student 101: Saurav
// Missing key: null
// Default value: Not Found
// After update: {103=Amit, 102=Priya, 101=Saurav}
// After putIfAbsent: {104=Neha, 103=Amit, 102=Priya, 101=Saurav}
// Contains key 103: true
// Contains value Amit: true
// After replace: {104=Anjali, 103=Ankit, 102=Priya, 101=Saurav}
// After removing key 102: {104=Anjali, 103=Ankit, 101=Saurav}
// Conditional remove: true
// Size: 2
// Is empty: false
// After clear: {}