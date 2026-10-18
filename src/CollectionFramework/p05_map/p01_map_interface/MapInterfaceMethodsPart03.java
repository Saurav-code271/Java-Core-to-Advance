package CollectionFramework.p05_map.p01_map_interface;
// 1. This class covers the remaining key methods, including keySet(), values(), entrySet(), forEach(), replaceAll(), compute(), merge(), and more.

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterfaceMethodsPart03 {
    public static void main(String[] args) {

        Map<String, Integer> marks = new HashMap<>();

        marks.put("Java", 80);
        marks.put("SQL", 70);
        marks.put("DSA", 90);

        // 1. keySet(): get all keys
        Set<String> keys = marks.keySet();
        System.out.println("Keys: " + keys);

        // 2. values(): get all values
        Collection<Integer> values = marks.values();
        System.out.println("Values: " + values);

        // 3. entrySet(): get key-value entries
        System.out.println("Entries:");
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // 4. forEach(): process each entry
        System.out.println("Using forEach:");
        marks.forEach((subject, score) ->
                System.out.println(subject + ": " + score));

        // 5. replaceAll(): update every value
        marks.replaceAll((subject, score) -> score + 5);
        System.out.println("After replaceAll: " + marks);

        // 6. putIfAbsent(): add only if absent
        marks.putIfAbsent("Python", 75);
        System.out.println("After putIfAbsent: " + marks);

        // 7. compute(): calculate a value for a key
        marks.compute("Java", (subject, score) ->
                score == null ? 0 : score + 10);
        System.out.println("After compute: " + marks);

        // 8. computeIfAbsent(): calculate if key is absent
        marks.computeIfAbsent("C++", subject -> 60);
        System.out.println("After computeIfAbsent: " + marks);

        // 9. computeIfPresent(): calculate if key is present
        marks.computeIfPresent("SQL", (subject, score) -> score + 10);
        System.out.println("After computeIfPresent: " + marks);

        // 10. merge(): combine an existing value with a new value
        marks.merge("DSA", 5, Integer::sum);
        System.out.println("After merge: " + marks);

        // 11. Conditional replacement
        marks.replace("Python", 80, 85);
        System.out.println("After conditional replace: " + marks);

        // 12. getOrDefault()
        System.out.println("Cloud marks: "
                + marks.getOrDefault("Cloud", 0));
    }
}

// Output: Because HashMap doesn't guarantee iteration order, the order of keys and entries can vary.

// Keys: [Java, SQL, DSA]
// Values: [80, 70, 90]
// Entries:
// Java = 80
// SQL = 70
// DSA = 90
// Using forEach:
// Java: 80
// SQL: 70
// DSA: 90
// After replaceAll: {Java=85, SQL=75, DSA=95}
// After putIfAbsent: {Java=85, SQL=75, DSA=95, Python=75}
// After compute: {Java=95, SQL=75, DSA=95, Python=75}
// After computeIfAbsent: {Java=95, SQL=75, DSA=95, Python=75, C++=60}
// After computeIfPresent: {Java=95, SQL=85, DSA=95, Python=75, C++=60}
// After merge: {Java=95, SQL=85, DSA=100, Python=75, C++=60}
// After conditional replace: {Java=95, SQL=85, DSA=100, Python=75, C++=60}
// Cloud marks: 0


// 2. Understand the methods:

//    Method	                        What it does

// 1. keySet()	                        Returns a view of all keys
// 2. values()	                        Returns a view of all values
// 3. entrySet()	                    Returns a view of key-value entries
// 4. forEach()	                        Performs an action for each mapping
// 5. replaceAll()	                    Replaces each value using a function
// 6. compute()	                        Computes a new value for a key
// 7. computeIfAbsent()	                Computes a value when the key is absent or mapped to null
// 8. computeIfPresent()	            Computes a value when the key exists and maps to a non-null value
// 9. merge()	                        Combines a supplied value with the existing non-null value
// 10. replace(key, old, new)	        Replaces only if the current value matches old

// 3. Important: keySet(), values(), and entrySet() are backed views of the map.
// Changes to the map can be reflected in these views.

// 4. Also, for compute() and related methods, returning null from the remapping function removes the mapping (or leaves it absent).