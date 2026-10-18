package CollectionFramework.p05_map.p02_hashmap;
// 1. A HashMap stores data in key-value pairs. Each key must be unique, but values can be duplicated.
// 2. Important properties:

// 1. HashMap does not guarantee insertion or sorted order.
// 2. It allows one null key and multiple null values.
// 3. Adding an existing key updates its value.
// 4. It is not thread-safe by default.
// 5. Average lookup and insertion are typically \(O(1)\), assuming good hash distribution.

// 3. This class covers creating a HashMap, constructors, adding entries, accessing values, updating entries and removing them.

import java.util.HashMap;
import java.util.Map;

public class HashMapMethodsPart01 {
    public static void main(String[] args) {

        // 1. Create a HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // 2. Add entries using put()
        students.put(101, "Saurav");
        students.put(102, "Rahul");
        students.put(103, "Amit");

        System.out.println("Students: " + students);

        // 3. Access values using get()
        System.out.println("Student 101: " + students.get(101));
        System.out.println("Student 105: " + students.get(105));

        // 4. Duplicate key: existing value gets replaced
        students.put(102, "Priya");
        System.out.println("After updating 102: " + students);

        // 5. Add only if the key is absent
        students.putIfAbsent(104, "Neha");
        students.putIfAbsent(101, "New Name");
        System.out.println("After putIfAbsent: " + students);

        // 6. Check keys and values
        System.out.println("Contains key 103: "
                + students.containsKey(103));

        System.out.println("Contains value Amit: "
                + students.containsValue("Amit"));

        // 7. Replace an existing value
        students.replace(104, "Anjali");
        System.out.println("After replace: " + students);

        // 8. Remove an entry
        students.remove(103);
        System.out.println("After remove: " + students);

        // 9. Remove only if key and value match
        System.out.println("Conditional remove: "
                + students.remove(101, "Saurav"));

        // 10. Basic information
        System.out.println("Size: " + students.size());
        System.out.println("Is empty: " + students.isEmpty());

        // 11. Create a map using another map
        Map<Integer, String> copiedStudents = new HashMap<>(students);
        System.out.println("Copied map: " + copiedStudents);

        // 12. Clear all entries
        copiedStudents.clear();
        System.out.println("After clear: " + copiedStudents);
    }
}

// Output:

// Students: {101=Saurav, 102=Rahul, 103=Amit}
// Student 101: Saurav
// Student 105: null
// After updating 102: {101=Saurav, 102=Priya, 103=Amit}
// After putIfAbsent: {101=Saurav, 102=Priya, 103=Amit, 104=Neha}
// Contains key 103: true
// Contains value Amit: true
// After replace: {101=Saurav, 102=Priya, 103=Amit, 104=Anjali}
// After remove: {101=Saurav, 102=Priya, 104=Anjali}
// Conditional remove: true
// Size: 2
// Is empty: false
// Copied map: {102=Priya, 104=Anjali}
// After clear: {}
