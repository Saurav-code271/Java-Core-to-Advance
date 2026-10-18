package CollectionFramework.p05_map.p04_treemap;
// 1. TreeMap is important for interviews because it stores key-value pairs in sorted key order and supports navigation and range-based operations.
// 2. This class covers basic operations, insertion, updating, searching, removing, and retrieving the first and last keys.

import java.util.TreeMap;

public class TreeMapMethodsPart01 {
    public static void main(String[] args) {

        TreeMap<Integer, String> students = new TreeMap<>();

        // 1. Add elements
        students.put(103, "Amit");
        students.put(101, "Saurav");
        students.put(105, "Neha");
        students.put(102, "Rahul");
        students.put(104, "Priya");

        System.out.println("Original map: " + students);

        // 2. Get values
        System.out.println("Value for key 103: " + students.get(103));
        System.out.println("Missing key: " + students.get(110));
        System.out.println("Default value: "
                + students.getOrDefault(110, "Not Found"));

        // 3. Update and insert only if absent
        students.put(103, "Ankit");
        students.putIfAbsent(106, "Riya");

        System.out.println("After updates: " + students);

        // 4. Search
        System.out.println("Contains key 102: "
                + students.containsKey(102));
        System.out.println("Contains value Rahul: "
                + students.containsValue("Rahul"));

        // 5. First and last entries
        System.out.println("First key: " + students.firstKey());
        System.out.println("Last key: " + students.lastKey());
        System.out.println("First entry: " + students.firstEntry());
        System.out.println("Last entry: " + students.lastEntry());

        // 6. Remove
        students.remove(104);
        System.out.println("After removing key 104: " + students);

        // 7. Size and empty checks
        System.out.println("Size: " + students.size());
        System.out.println("Is empty: " + students.isEmpty());

        // 8. Iterate in sorted key order
        System.out.println("Sorted entries:");
        students.forEach((key, value) ->
                System.out.println(key + " -> " + value));
    }
}

// Output:

// Original map: {101=Saurav, 102=Rahul, 103=Amit, 104=Priya, 105=Neha}
// Value for key 103: Amit
// Missing key: null
// Default value: Not Found
// After updates: {101=Saurav, 102=Rahul, 103=Ankit, 104=Priya, 105=Neha, 106=Riya}
// Contains key 102: true
// Contains value Rahul: true
// First key: 101
// Last key: 106
// First entry: 101=Saurav
// Last entry: 106=Riya
// After removing key 104: {101=Saurav, 102=Rahul, 103=Ankit, 105=Neha, 106=Riya}
// Size: 5
// Is empty: false
// Sorted entries:
// 101 -> Saurav
// 102 -> Rahul
// 103 -> Ankit
// 105 -> Neha
// 106 -> Riya

// 2. The key difference from HashMap is that TreeMap keeps the keys sorted automatically.
// With integer keys, they appear in ascending numerical order.
