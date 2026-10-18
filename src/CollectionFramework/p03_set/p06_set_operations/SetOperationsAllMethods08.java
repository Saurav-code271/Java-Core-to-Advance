package CollectionFramework.p03_set.p06_set_operations;
// 1. Create one final class as your revision reference.

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetOperationsAllMethods08 {
    public static void main(String[] args) {

        Set<Integer> a =
                new HashSet<>(Set.of(10, 20, 30, 40));

        Set<Integer> b =
                new HashSet<>(Set.of(30, 40, 50, 60));

        // 1. Union
        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println("Union: " + union);

        // 2. Intersection
        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println("Intersection: " + intersection);

        // 3. Difference: A - B
        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.println("A - B: " + difference);

        // 4. Symmetric difference
        Set<Integer> symmetric = new HashSet<>(union);
        symmetric.removeAll(intersection);
        System.out.println("Symmetric difference: " + symmetric);

        // 5. Subset check
        Set<Integer> small = new HashSet<>(Set.of(10, 20));
        System.out.println("Small is subset of A: "
                + a.containsAll(small));

        // 6. Disjoint check
        Set<Integer> c = new HashSet<>(Set.of(70, 80));
        System.out.println("A and C are disjoint: "
                + Collections.disjoint(a, c));

        // Original sets remain unchanged
        System.out.println("Original A: " + a);
        System.out.println("Original B: " + b);
    }
}

// Output:

// Union: [10, 20, 30, 40, 50, 60]
// Intersection: [30, 40]
// A - B: [10, 20]
// Symmetric difference: [10, 20, 50, 60]
// Small is subset of A: true
// A and C are disjoint: true
// Original A: [10, 20, 30, 40]
// Original B: [30, 40, 50, 60]

// 2. Points:

// Operation	                        Java approach	          Result
// 1. Union	                            addAll()	              Elements in A or B
// 2. Intersection	                    retainAll()	              Elements in both
// 3. Difference	                    removeAll()	              Elements in A but not B
// 4. Symmetric difference              Union minus intersection  Elements in exactly one set
// 5. Subset check	                    containsAll()	          Whether one set is contained in another
// 6. Disjoint check	                Collections.disjoint()	  Whether sets have no common elements

// 3. One important rule: addAll(), retainAll(), and removeAll() modify the collection on which you call them.
// Copy the set first when you want to preserve the original.

// 4. Compatibility note: Set.of() requires Java 9 or later.
// If your IntelliJ project uses Java 8, replace those expressions with a HashSet populated using Arrays.asList().