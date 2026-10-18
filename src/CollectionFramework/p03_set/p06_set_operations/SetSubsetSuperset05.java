package CollectionFramework.p03_set.p06_set_operations;
// 1. A subset means every element of one set is also present in another set.
// 2. A superset contains every element of the other set.

// For example:

//  A = {10, 20}
//  B = {10, 20, 30, 40}
//  A is a subset of B, and B is a superset of A.

import java.util.HashSet;
import java.util.Set;

public class SetSubsetSuperset05 {
    public static void main(String[] args) {
        Set<Integer> setA =
                new HashSet<>(Set.of(10, 20));

        Set<Integer> setB =
                new HashSet<>(Set.of(10, 20, 30, 40));

        Set<Integer> setC =
                new HashSet<>(Set.of(10, 50));

        // Is A a subset of B?
        boolean isSubset = setB.containsAll(setA);

        // Is B a superset of A?
        boolean isSuperset = setB.containsAll(setA);

        // Is C a subset of B?
        boolean isCSubset = setB.containsAll(setC);

        System.out.println("A: " + setA);
        System.out.println("B: " + setB);
        System.out.println("A is a subset of B: " + isSubset);
        System.out.println("B is a superset of A: " + isSuperset);
        System.out.println("C is a subset of B: " + isCSubset);
    }
}

// Output:

// A is a subset of B: true
// B is a superset of A: true
// C is a subset of B: false

// 3. Notice that the same check works for both subset and superset relationships.
// To check whether A is a subset of B, ask whether B contains every element of A.

// 4. Interview point: Java doesn't have a separate isSubset() method in the Set interface. Use containsAll().
