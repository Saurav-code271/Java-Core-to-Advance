package CollectionFramework.p03_set.p06_set_operations;
// 1. Symmetric difference returns elements that belong to either set, but not both
// 2. Java’s Set interface doesn't provide a dedicated symmetricDifference() method.
// We can build it using the operations we already learned.

import java.util.HashSet;
import java.util.Set;

public class etSymmetricDifference04 {
    public static void main(String[] args) {
        Set<Integer> setA =
                new HashSet<>(Set.of(10, 20, 30, 40));

        Set<Integer> setB =
                new HashSet<>(Set.of(30, 40, 50, 60));

        Set<Integer> result = new HashSet<>(setA);

        // Keep elements that are in either set.
        result.addAll(setB);

        // Remove elements shared by both sets.
        Set<Integer> common = new HashSet<>(setA);
        common.retainAll(setB);

        result.removeAll(common);

        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);
        System.out.println("Symmetric difference: " + result);
    }
}

// Output:

// Symmetric difference: [10, 20, 50, 60]

// 3. Logic to remember:

// 1. Copy A into the result.
// 2. Add all elements of B.
// 3. Find the intersection.
// 4. Remove the intersection from the result.

//This leaves only elements unique to one set.
