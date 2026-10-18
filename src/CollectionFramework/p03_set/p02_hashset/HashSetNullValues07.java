package CollectionFramework.p03_set.p02_hashset;
// 1. A HashSet allows one null element.

import java.util.HashSet;

public class HashSetNullValues07 {
    public static void main(String[] args) {
        HashSet<String> values = new HashSet<>();

        System.out.println(values.add(null));
        System.out.println(values.add("Java"));
        System.out.println(values.add(null));

        System.out.println("Values: " + values);
        System.out.println("Contains null: " + values.contains(null));

        values.remove(null);

        System.out.println("After removing null: " + values);
    }
}

// Expected output:

// true
// true
// false
// Values: [null, Java]
// Contains null: true
// After removing null: [Java]

// 2. Key point: Adding null twice doesn't create two null elements. Other implementations,
// such as TreeSet with natural ordering, generally don't accept null.