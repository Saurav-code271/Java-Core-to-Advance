package CollectionFramework.p05_map.p06_map_traversal;
// 1. Now practise real situations: finding entries, updating values, filtering, and removing entries while traversing.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTraversalPart02 {
    public static void main(String[] args) {

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Java", 90);
        marks.put("SQL", 45);
        marks.put("DSA", 75);
        marks.put("Python", 35);
        marks.put("Spring Boot", 85);

        System.out.println("Original marks: " + marks);

        // 1. Find subjects with marks >= 75
        System.out.println("\nSubjects with marks >= 75:");
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            if (entry.getValue() >= 75) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }

        // 2. Count passing subjects (pass mark = 40)
        int passingCount = 0;

        for (Integer score : marks.values()) {
            if (score >= 40) {
                passingCount++;
            }
        }

        System.out.println("\nPassing subjects: " + passingCount);

        // 3. Update values during traversal
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            if (entry.getValue() >= 75) {
                entry.setValue(entry.getValue() + 5);
            }
        }

        System.out.println("\nAfter bonus marks: " + marks);

        // 4. Remove entries safely with Iterator
        Iterator<Map.Entry<String, Integer>> iterator =
                marks.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();

            if (entry.getValue() < 40) {
                iterator.remove();
            }
        }

        System.out.println("\nAfter removing marks below 40: " + marks);

        // 5. Traverse with forEach
        System.out.println("\nFinal results:");
        marks.forEach((subject, score) ->
                System.out.println(subject + " -> " + score));
    }
}

// Output:

//Original marks: {Java=90, SQL=45, DSA=75, Python=35, Spring Boot=85}

//Subjects with marks >= 75:
//Java = 90
//DSA = 75
//Spring Boot = 85

//Passing subjects: 4

//After bonus marks: {Java=95, SQL=45, DSA=80, Python=35, Spring Boot=90}

//After removing marks below 40: {Java=95, SQL=45, DSA=80, Spring Boot=90}

//Final results:
//Java -> 95
//SQL -> 45
//DSA -> 80
//Spring Boot -> 90

// 2. Note: The order of entries may vary in the actual output:

// 1. Why is entrySet() often preferred when you need both the key and value?
// It gives you each entry directly, instead of iterating over keys and looking up each value separately.

// 2. Can you remove an entry inside an enhanced for loop?
// Avoid calling map.remove(key) directly while iterating over the map. For safe removal during iteration, use iterator.remove().

// 3. Can you update a value using entry.setValue()?
// Yes, for entries obtained from a modifiable map's entry view. Updating the value this way doesn't structurally modify the map.

// 4. Does forEach() guarantee order?
// No. The order depends on the map implementation. For example, TreeMap traverses keys in sorted order,
// while LinkedHashMap preserves its configured iteration order.