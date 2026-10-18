package CollectionFramework.p05_map.p03_linkedhashmap;
// 1. Now move to LinkedHashMap, which is similar to HashMap but maintains a predictable iteration order.

import java.util.LinkedHashMap;

public class LinkedHashMapMethodsPart01 {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();

        students.put(103, "Amit");
        students.put(101, "Saurav");
        students.put(102, "Rahul");

        System.out.println("Original map: " + students);

        students.put(102, "Priya");
        System.out.println("After updating key 102: " + students);

        students.putIfAbsent(104, "Neha");
        System.out.println("After putIfAbsent: " + students);

        System.out.println("Value for key 101: " + students.get(101));
        System.out.println("Contains key 103: " + students.containsKey(103));
        System.out.println("Contains value Amit: " + students.containsValue("Amit"));

        students.replace(103, "Amit", "Ankit");
        System.out.println("After conditional replace: " + students);

        students.remove(101);
        System.out.println("After removing key 101: " + students);

        System.out.println("Size: " + students.size());
        System.out.println("Is empty: " + students.isEmpty());

        System.out.println("Iterating in insertion order:");
        students.forEach((key, value) ->
                System.out.println(key + " -> " + value));
    }
}

// Output:

// Original map: {103=Amit, 101=Saurav, 102=Rahul}
// After updating key 102: {103=Amit, 101=Saurav, 102=Priya}
// After putIfAbsent: {103=Amit, 101=Saurav, 102=Priya, 104=Neha}
// Value for key 101: Saurav
// Contains key 103: true
// Contains value Amit: true
// After conditional replace: {103=Ankit, 101=Saurav, 102=Priya, 104=Neha}
// After removing key 101: {103=Ankit, 102=Priya, 104=Neha}
// Size: 3
// Is empty: false
// Iterating in insertion order:
// 103 -> Ankit
// 102 -> Priya
// 104 -> Neha

// 2. Notice that updating the value for key 102 does not move that key to the end in the default insertion-order mode.