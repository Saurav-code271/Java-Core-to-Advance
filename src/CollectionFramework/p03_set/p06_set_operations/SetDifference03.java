package CollectionFramework.p03_set.p06_set_operations;
// 1. Difference returns the elements in Set A that are not in Set B.
//                    A-B={10,20}

import java.util.HashSet;
import java.util.Set;

public class SetDifference03 {
    public static void main(String[] args) {
        Set<Integer> setA =
                new HashSet<>(Set.of(10, 20, 30, 40));

        Set<Integer> setB =
                new HashSet<>(Set.of(30, 40, 50, 60));

        Set<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);

        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);
        System.out.println("A - B: " + difference);

        Set<Integer> reverseDifference = new HashSet<>(setB);
        reverseDifference.removeAll(setA);

        System.out.println("B - A: " + reverseDifference);
    }
}

// Output:

// A - B: [10, 20]
// B - A: [50, 60]

// 2. Remember: Set difference is directional.

// 1. A - B means remove all elements of B from a copy of A.
// 2. B - A means remove all elements of A from a copy of B.
