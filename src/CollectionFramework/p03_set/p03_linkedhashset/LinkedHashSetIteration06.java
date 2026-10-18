package CollectionFramework.p03_set.p03_linkedhashset;
// 1. Iteration follows insertion order.

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetIteration06 {
    public static void main(String[] args) {
        LinkedHashSet<String> names =
                new LinkedHashSet<>();

        names.add("Saurav");
        names.add("Rahul");
        names.add("Aman");

        // Enhanced for loop
        for (String name : names) {
            System.out.println(name);
        }

        // Iterator
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println("Iterator: " + iterator.next());
        }

        // forEach
        names.forEach(name ->
                System.out.println("forEach: " + name));
    }
}

// 2. Each method prints Saurav, Rahul, and Aman in that order.