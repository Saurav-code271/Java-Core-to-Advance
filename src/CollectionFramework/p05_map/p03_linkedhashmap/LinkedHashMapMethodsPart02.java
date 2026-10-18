package CollectionFramework.p05_map.p03_linkedhashmap;
// 1. This class covers key/value views, iteration, copying, bulk operations, and insertion order versus access order.

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapMethodsPart02 {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> scores = new LinkedHashMap<>();

        scores.put("Java", 90);
        scores.put("SQL", 80);
        scores.put("DSA", 85);

        System.out.println("Scores: " + scores);
        System.out.println("Keys: " + scores.keySet());
        System.out.println("Values: " + scores.values());
        System.out.println("Entries: " + scores.entrySet());

        System.out.println("Entry-by-entry:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        LinkedHashMap<String, Integer> copied = new LinkedHashMap<>(scores);
        copied.put("Spring Boot", 95);

        System.out.println("Original map: " + scores);
        System.out.println("Copied map: " + copied);

        scores.putAll(copied);
        System.out.println("After putAll: " + scores);

        scores.replaceAll((subject, marks) -> marks + 1);
        System.out.println("After adding 1 mark: " + scores);

        scores.keySet().remove("SQL");
        System.out.println("After removing SQL through keySet: " + scores);

        // Access-order mode: recently accessed entries move to the end
        LinkedHashMap<String, Integer> accessOrderMap =
                new LinkedHashMap<>(16, 0.75f, true);

        accessOrderMap.put("A", 1);
        accessOrderMap.put("B", 2);
        accessOrderMap.put("C", 3);

        System.out.println("Before access: " + accessOrderMap);

        accessOrderMap.get("A");

        System.out.println("After accessing A: " + accessOrderMap);
    }
}

// Output:

// Scores: {Java=90, SQL=80, DSA=85}
// Keys: [Java, SQL, DSA]
// Values: [90, 80, 85]
// Entries: [Java=90, SQL=80, DSA=85]
// Entry-by-entry:
// Java = 90
// SQL = 80
// DSA = 85
// Original map: {Java=90, SQL=80, DSA=85}
// Copied map: {Java=90, SQL=80, DSA=85, Spring Boot=95}
// After putAll: {Java=90, SQL=80, DSA=85, Spring Boot=95}
// After adding 1 mark: {Java=91, SQL=81, DSA=86, Spring Boot=96}
// After removing SQL through keySet: {Java=91, DSA=86, Spring Boot=96}
// Before access: {A=1, B=2, C=3}
// After accessing A: {B=2, C=3, A=1}

// 2. HashMap vs LinkedHashMap:

//    Feature	                             HashMap	                 LinkedHashMap

// 1. Key-value storage	                     Yes	       -              Yes
// 2. Guarantees iteration order	         No	                          Yes, by default insertion order
// 3. Allows null key	                     Yes, one	                  Yes, one
// 4. Allows null values	                 Yes	        -              Yes
// 5. Performance	                         Usually average O(1) for basic operations	Usually average O(1) for basic operations
// 6. Extra ordering overhead	             No linked iteration order	    Maintains linked ordering

// 3. Interview tip: LinkedHashMap is useful when you need predictable iteration order,
// such as displaying records in the order they were added. Its access-order mode is also useful when implementing an LRU cache.