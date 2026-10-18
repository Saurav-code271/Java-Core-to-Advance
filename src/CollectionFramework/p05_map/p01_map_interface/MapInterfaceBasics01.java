package CollectionFramework.p05_map.p01_map_interface;
// 1. What is a Map in Java? -> A Map stores data as key-value pairs.
// 2. For example, imagine storing student roll numbers and names:
//  Roll No. 101                    Rahul
// Here, the roll number is the key, and the student's name is the value.

// 3. Important rules:

// 1. Every key is unique. Adding the same key again replaces its previous value.
// 2. Different keys can have the same value.
// 3. Map is an interface, so you cannot create it directly using new Map<>().
// 4. Map is not a subtype of the Collection interface.
// 5. HashMap is a common implementation of Map.

// 4. Map hierarchy:

//                                        Map<K, V>
//                                       (Interface)
//                                            ^
//                        HashMap                          LinkedHashMap
//                  (No order guarantee)                 (Encounter order)

//                        TreeMap                            Hashtable
//                      (Sorted keys)                   (Legacy synchronized map)


import java.util.HashMap;
import java.util.Map;

public class MapInterfaceBasics01 {
    public static void main(String[] args) {

        // Create a Map using HashMap
        Map<Integer, String> students = new HashMap<>();

        // Add key-value pairs
        students.put(101, "Rahul");
        students.put(102, "Priya");
        students.put(103, "Amit");

        System.out.println("Students: " + students);

        // Access a value using its key
        System.out.println("Student 101: " + students.get(101));

        // Update an existing key
        students.put(102, "Neha");
        System.out.println("After update: " + students);

        // Add the same key again
        students.put(101, "Rahul Kumar");
        System.out.println("After replacing key 101: " + students);

        // Check whether a key or value exists
        System.out.println("Contains key 103: "
                + students.containsKey(103));

        System.out.println("Contains value Amit: "
                + students.containsValue("Amit"));

        // Check size
        System.out.println("Map size: " + students.size());

        // Remove an entry
        students.remove(103);
        System.out.println("After removing key 103: " + students);
    }
}

// Output: The order of entries may vary because HashMap does not guarantee iteration order.

// Students: {101=Rahul, 102=Priya, 103=Amit}
// Student 101: Rahul
// After update: {101=Rahul, 102=Neha, 103=Amit}
// After replacing key 101: {101=Rahul Kumar, 102=Neha, 103=Amit}
// Contains key 103: true
// Contains value Amit: false
// Map size: 3
// After removing key 103: {101=Rahul Kumar, 102=Neha}