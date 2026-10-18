package CollectionFramework.p03_set.p06_set_operations;
// 1. Intersection returns only the elements that exist in both sets.
// 2. Use retainAll() to keep only the elements shared with another collection.

import java.util.HashSet;
import java.util.Set;

public class SetIntersection02 {
    public static void main(String[] args) {
        Set<Integer> setA =
                new HashSet<>(Set.of(10, 20, 30, 40));

        Set<Integer> setB =
                new HashSet<>(Set.of(30, 40, 50, 60));

        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);

        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);
        System.out.println("Intersection: " + intersection);
    }
}

// Output:

// Set A: [40, 10, 20, 30]
// Set B: [60, 50, 40, 30]
// Intersection: [40, 30]

// 3.  Remember:

// 1.  addAll() → adds elements from another collection.
// 2.  retainAll() → keeps only common elements.
// 3.  Both methods modify the set on which they are called.

// 4. We use a copy here so the original sets remain unchanged.
