package CollectionFramework.p03_set.p06_set_operations;
// 1. Two sets are called disjoint if they have no common elements.

//  2. For example:

//  A = {10, 20, 30}
//  B = {40, 50, 60}
// These sets are disjoint. But if B contains 30, they are no longer disjoint.

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetDisjointCheck06 {
    public static void main(String[] args) {
        Set<Integer> setA =
                new HashSet<>(Set.of(10, 20, 30));

        Set<Integer> setB =
                new HashSet<>(Set.of(40, 50, 60));

        Set<Integer> setC =
                new HashSet<>(Set.of(30, 40, 50));

        System.out.println("A and B are disjoint: "
                + Collections.disjoint(setA, setB));

        System.out.println("A and C are disjoint: "
                + Collections.disjoint(setA, setC));
    }
}

// Output:

// A and B are disjoint: true
// A and C are disjoint: false

// 3. Remember: Collections.disjoint(setA, setB) returns true when there are no common elements.