package CollectionFramework.p05_map.p05_hashtable;
// 1. This class covers traversal, bulk operations, copying, and null restrictions.

import java.util.Hashtable;
import java.util.Map;

public class HashtableMethodsPart02 {
    public static void main(String[] args) {

        Hashtable<String, Integer> marks = new Hashtable<>();

        marks.put("Java", 90);
        marks.put("SQL", 80);
        marks.put("DSA", 85);

        System.out.println("Marks: " + marks);

        // 1. Traverse keys
        System.out.println("Keys:");
        for (String key : marks.keySet()) {
            System.out.println(key);
        }

        // 2. Traverse values
        System.out.println("Values:");
        for (Integer value : marks.values()) {
            System.out.println(value);
        }

        // 3. Traverse entries
        System.out.println("Entries:");
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // 4. forEach
        System.out.println("Using forEach:");
        marks.forEach((key, value) ->
                System.out.println(key + " -> " + value));

        // 5. putAll
        Hashtable<String, Integer> extraMarks = new Hashtable<>();
        extraMarks.put("Cloud", 88);
        extraMarks.put("SQL", 95);

        marks.putAll(extraMarks);
        System.out.println("After putAll: " + marks);

        // 6. replaceAll
        marks.replaceAll((subject, score) -> score + 1);
        System.out.println("After adding 1 mark: " + marks);

        // 7. Copy
        Hashtable<String, Integer> copied = new Hashtable<>(marks);
        System.out.println("Copied table: " + copied);

        // 8. Null restrictions
        try {
            marks.put(null, 100);
        } catch (NullPointerException e) {
            System.out.println("Null key is not allowed");
        }

        try {
            marks.put("Python", null);
        } catch (NullPointerException e) {
            System.out.println("Null value is not allowed");
        }
    }
}

// Output: The ordering of keys and entries may vary.

//Marks: {DSA=85, SQL=80, Java=90}
//Keys:
//DSA
//SQL
//Java
//Values:
//85
//80
//90
//Entries:
//DSA = 85
//SQL = 80
//Java = 90
//Using forEach:
//DSA -> 85
//SQL -> 80
//Java -> 90
//After putAll: {Cloud=88, DSA=85, SQL=95, Java=90}
//After adding 1 mark: {Cloud=89, DSA=86, SQL=96, Java=91}
//Copied table: {Cloud=89, DSA=86, SQL=96, Java=91}
//Null key is not allowed
//Null value is not allowed

// 2. HashMap vs Hashtable:

//    Feature	              HashMap	                    Hashtable

// 1. Thread safety	          Not synchronized by default	Synchronized methods
// 2. Null key	              One allowed	                Not allowed
// 3. Null values	          Allowed	                    Not allowed
// 4. Iteration order	      No guarantee	     -          No guarantee
// 5. Status	              Common modern choice	        Legacy class
// 6. Concurrent alternative	ConcurrentHashMap	        Usually prefer ConcurrentHashMap for concurrent access

// 3. Interview points to remember:

// 1. Hashtable is synchronized, but that does not automatically make a sequence of multiple operations atomic.
// 2. For modern concurrent applications, ConcurrentHashMap is usually preferred.
// 3. Neither HashMap nor Hashtable guarantees sorted iteration.
// 4. Hashtable rejects null keys and values with NullPointerException.