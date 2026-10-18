package CollectionFramework.p05_map.p06_map_traversal;
// 1. Map traversal means accessing each key-value pair in a Map.
// This is an important Java interview topic because you should know not only how to iterate, but also which approach is best for a particular task.
// 2. This class covers keySet(), values(), entrySet(), forEach(), and Iterator.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTraversalPart01 {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Saurav");
        students.put(102, "Rahul");
        students.put(103, "Amit");

        System.out.println("Original map: " + students);

        // 1. Traverse using keySet()
        System.out.println("\nUsing keySet():");
        for (Integer key : students.keySet()) {
            System.out.println(key);
        }

        // 2. Traverse using values()
        System.out.println("\nUsing values():");
        for (String value : students.values()) {
            System.out.println(value);
        }

        // 3. Traverse using entrySet()
        System.out.println("\nUsing entrySet():");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 4. Traverse using forEach()
        System.out.println("\nUsing forEach():");
        students.forEach((key, value) ->
                System.out.println(key + " -> " + value));

        // 5. Traverse using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<Map.Entry<Integer, String>> iterator =
                students.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

// 3. Understand the methods:

//    Method	     Use

// 1. keySet()	     Access all keys
// 2. values()	     Access all values
// 3. entrySet()	 Access keys and values together
// 4. forEach()	     Traverse using a lambda expression
// 5. iterator()	 Traverse manually and safely remove entries through the iterator

// Output: The order may differ because HashMap doesn't guarantee iteration order.

//Original map: {101=Saurav, 102=Rahul, 103=Amit}

//Using keySet():
//101
//102
//103

//Using values():
//Saurav
//Rahul
//Amit

//Using entrySet():
//101 -> Saurav
//102 -> Rahul
//103 -> Amit

//Using forEach():
//101 -> Saurav
//102 -> Rahul
//103 -> Amit

//Using Iterator:
//101 -> Saurav
//102 -> Rahul
//103 -> Amit