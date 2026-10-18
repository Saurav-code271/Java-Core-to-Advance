package CollectionFramework.p05_map.p02_hashmap;
// 1. focusing on advanced HashMap concepts that are important for Java interviews:

// 1. Advanced HashMap methods and practical examples.
// 2. Custom objects as keys using equals() and hashCode().
// 3. Hash collisions and why two different keys can have the same hash code.
// 4. A practical student-record example.

// 2. This class focuses on conditional updates, replaceAll(), computeIfAbsent(), computeIfPresent(), compute(), and merge().

import java.util.HashMap;

public class HashMapAdvancedMethodsPart03 {
    public static void main(String[] args) {

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Java", 80);
        marks.put("SQL", 70);
        marks.put("Python", 60);

        System.out.println("Original marks: " + marks);

        // 1. Replace only if the old value matches
        boolean updated = marks.replace("Java", 80, 85);
        System.out.println("Conditional replace successful: " + updated);
        System.out.println("After conditional replace: " + marks);

        // 2. Replace every value using a function
        marks.replaceAll((subject, score) -> score + 5);
        System.out.println("After adding 5 marks: " + marks);

        // 3. Add a value only if the key is absent
        marks.computeIfAbsent("Spring", key -> 75);
        marks.computeIfAbsent("Java", key -> 100);
        System.out.println("After computeIfAbsent: " + marks);

        // 4. Update only if the key already exists
        marks.computeIfPresent("SQL", (key, value) -> value + 10);
        marks.computeIfPresent("AWS", (key, value) -> value + 10);
        System.out.println("After computeIfPresent: " + marks);

        // 5. Compute a new value whether the key exists or not
        marks.compute("Python", (key, value) -> value == null ? 50 : value + 20);
        marks.compute("DSA", (key, value) -> 90);
        System.out.println("After compute: " + marks);

        // 6. Merge a value with the existing value
        marks.merge("Java", 10, Integer::sum);
        marks.merge("Cloud", 80, Integer::sum);
        System.out.println("After merge: " + marks);
    }
}

// 3. Understand the important methods:

//    Method	                               What it does

// 1. replace(key, oldValue, newValue)	       Replaces only when both the key and old value match
// 2. replaceAll()	                           Updates every mapped value
// 3. computeIfAbsent() 	                   Computes a value only if the key is missing or mapped to null
// 4. computeIfPresent()	                   Computes a value only if the key exists with a non-null value
// 5. compute()	                               Computes a value whether or not the key currently has a mapping
// 6. merge()	                               Adds a new mapping or combines the supplied value with the existing non-null value

// 4. Output: The order of entries may differ because HashMap does not guarantee iteration order.

// Original marks: {Java=80, SQL=70, Python=60}
// Conditional replace successful: true
// After conditional replace: {Java=85, SQL=70, Python=60}
// After adding 5 marks: {Java=90, SQL=75, Python=65}
// After computeIfAbsent: {Java=90, SQL=75, Python=65, Spring=75}
// After computeIfPresent: {Java=90, SQL=85, Python=65, Spring=75}
// After compute: {Java=90, SQL=85, Python=85, Spring=75, DSA=90}
// After merge: {Java=100, SQL=85, Python=85, Spring=75, DSA=90, Cloud=80}

// 5. Interview point: If a remapping function used by compute() or merge() returns null,
// the corresponding mapping is removed. Be careful when using these methods with nullable values.
