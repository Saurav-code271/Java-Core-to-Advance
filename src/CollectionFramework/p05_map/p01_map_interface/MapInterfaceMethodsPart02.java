package CollectionFramework.p05_map.p01_map_interface;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceMethodsPart02 {
    public static void main(String[] args) {

        Map<String, Integer> marks = new HashMap<>();

        // put()
        marks.put("Java", 85);
        marks.put("SQL", 78);
        marks.put("DSA", 90);

        // get()
        System.out.println("Java marks: " + marks.get("Java"));

        // getOrDefault()
        System.out.println("Python marks: "
                + marks.getOrDefault("Python", 0));

        // putIfAbsent()
        marks.putIfAbsent("Java", 95);
        marks.putIfAbsent("Python", 88);
        System.out.println("After putIfAbsent: " + marks);

        // replace()
        marks.replace("SQL", 82);
        System.out.println("After replace: " + marks);

        // remove()
        marks.remove("DSA");
        System.out.println("After remove: " + marks);

        // Conditional remove
        marks.remove("Java", 85);
        System.out.println("After conditional remove: " + marks);
    }
}

// Output:

// Java marks: 85
// Python marks: 0
// After putIfAbsent: {Java=85, SQL=78, DSA=90, Python=88}
// After replace: {Java=85, SQL=82, DSA=90, Python=88}
// After remove: {Java=85, SQL=82, Python=88}
// After conditional remove: {SQL=82, Python=88}

// 2. Methods covered so far:

//    Method	                              Purpose

// 1. put(key, value)	                      Adds or updates an entry
// 2. get(key)	                              Returns the value for a key, or null if absent
// 3. getOrDefault(key, defaultValue)	      Returns a fallback value if the key is absent
// 4. putIfAbsent(key, value)	              Adds a mapping if the key is absent or currently mapped to null
// 5. containsKey(key)	                      Checks whether a key exists
// 6. containsValue(value)	                  Checks whether a value exists
// 7. replace(key, value)	                  Replaces the value for an existing key
// 8. remove(key)	                          Removes the mapping for a key
// 9. remove(key, value)	                  Removes only if the key maps to the specified value
// 10. size()	                              Returns the number of mappings
// 11. isEmpty()	                          Checks whether the map has no mappings
// 12. clear()	                              Removes all mappings
