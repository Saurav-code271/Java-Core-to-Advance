package CollectionFramework.p05_map.p02_hashmap;
// 1. This class explores null, iteration, views, bulk operations, and how HashMap handles keys with equal hash codes.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapMethodsPart02 {
    public static void main(String[] args) {

        // 1. Null key and null values
        HashMap<String, String> map = new HashMap<>();

        map.put(null, "Unknown");
        map.put("Java", null);
        map.put("SQL", "Database");
        map.put("Spring", "Framework");

        System.out.println("Map: " + map);
        System.out.println("Null key value: " + map.get(null));
        System.out.println("Java value: " + map.get("Java"));
        System.out.println("Contains Java key: "
                + map.containsKey("Java"));

        // 2. Key set
        System.out.println("Keys: " + map.keySet());

        // 3. Values collection
        System.out.println("Values: " + map.values());

        // 4. Iterate through entries
        System.out.println("Entries:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // 5. forEach()
        System.out.println("Using forEach:");
        map.forEach((key, value) ->
                System.out.println(key + " -> " + value));

        // 6. Bulk insertion
        HashMap<Integer, String> first = new HashMap<>();
        first.put(1, "One");
        first.put(2, "Two");

        HashMap<Integer, String> second = new HashMap<>();
        second.put(2, "Updated Two");
        second.put(3, "Three");

        first.putAll(second);
        System.out.println("After putAll: " + first);

        // 7. Bulk removal
        first.keySet().removeAll(Arrays.asList(1, 3));
        System.out.println("After removing keys 1 and 3: " + first);

        // 8. Compute and merge
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Java", 80);

        scores.compute("Java", (key, value) -> value + 5);
        scores.computeIfAbsent("SQL", key -> 70);
        scores.computeIfPresent("SQL", (key, value) -> value + 10);
        scores.merge("Java", 5, Integer::sum);

        System.out.println("Scores: " + scores);

        // 9. Collision concept demonstration
        HashMap<String, Integer> words = new HashMap<>();

        // "FB" and "Ea" have the same hashCode in Java.
        words.put("FB", 100);
        words.put("Ea", 200);

        System.out.println("FB hashCode: " + "FB".hashCode());
        System.out.println("Ea hashCode: " + "Ea".hashCode());
        System.out.println("Collision map: " + words);
        System.out.println("FB value: " + words.get("FB"));
        System.out.println("Ea value: " + words.get("Ea"));
    }
}

// Output: Map entry order may vary, but the following values should match:

// Map: {null=Unknown, Java=null, SQL=Database, Spring=Framework}
// Null key value: Unknown
// Java value: null
// Contains Java key: true
// Keys: [null, Java, SQL, Spring]
// Values: [Unknown, null, Database, Framework]
// Entries:
// null = Unknown
// Java = null
// SQL = Database
// Spring = Framework
// Using forEach:
// null -> Unknown
// Java -> null
// SQL -> Database
// Spring -> Framework
// After putAll: {1=One, 2=Updated Two, 3=Three}
// After removing keys 1 and 3: {2=Updated Two}
// Scores: {Java=90, SQL=80}
// FB hashCode: 2236
// Ea hashCode: 2236
// Collision map: {FB=100, Ea=200}
// FB value: 100
// Ea value: 200

// 2. Note: The displayed order of keys, values and entries is not guaranteed by HashMap.
// The example shows one possible order, not a promise.

// 3. Remember these distinctions:

// 1. Hash collision: different keys have the same hash code.
// 2. Same key: an equal key already exists, so its value is updated.
// 3. Different keys with the same hash: both mappings can coexist.


