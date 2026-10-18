package CollectionFramework.p03_set.p03_linkedhashset;
// 1. Like HashSet, LinkedHashSet allows one null value.

import java.util.LinkedHashSet;

public class LinkedHashSetNullDemo08 {
    public static void main(String[] args) {
        LinkedHashSet<String> values = new LinkedHashSet<>();

        values.add("Java");
        values.add(null);
        values.add("Python");
        values.add(null);

        System.out.println(values);
        System.out.println("Contains null: " + values.contains(null));

        values.remove(null);
        System.out.println("After removal: " + values);
    }
}

// Output:

// [Java, null, Python]
// Contains null: true
// After removal: [Java, Python]
