package CollectionFramework.p03_set.p05_sortedset_navigableset;
// 1. This is an important class because NavigableSet allows you to choose whether the boundary elements are included.

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetRangeMethods05 {
    public static void main(String[] args) {
        NavigableSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println("Original set: " + numbers);

        System.out.println("subSet(20, true, 50, true): "
                + numbers.subSet(20, true, 50, true));

        System.out.println("subSet(20, false, 50, false): "
                + numbers.subSet(20, false, 50, false));

        System.out.println("headSet(40, true): "
                + numbers.headSet(40, true));

        System.out.println("headSet(40, false): "
                + numbers.headSet(40, false));

        System.out.println("tailSet(30, true): "
                + numbers.tailSet(30, true));

        System.out.println("tailSet(30, false): "
                + numbers.tailSet(30, false));
    }
}

// Output:

// Original set: [10, 20, 30, 40, 50, 60]
// subSet(20, true, 50, true): [20, 30, 40, 50]
// subSet(20, false, 50, false): [30, 40]
// headSet(40, true): [10, 20, 30, 40]
// headSet(40, false): [10, 20, 30]
// tailSet(30, true): [30, 40, 50, 60]
// tailSet(30, false): [40, 50, 60]

// 2. The boolean parameters:

//    Method	                         Meaning

// 1. subSet(from, true, to, true)	     Includes both boundaries
// 2. subSet(from, false, to, false)	 Excludes both boundaries
// 3. headSet(value, true)	             Includes the upper boundary
// 4. tailSet(value, false)	             Excludes the lower boundary

// 3. Remember that subSet() requires the starting boundary to come before the ending boundary according to the set's ordering.
// 4.Real-world example: If you need all student marks from 40 through 80, inclusive, you can use:
// marks.subSet(40, true, 80, true);

// 5. One more detail: these range methods return backed views, not independent copies.
// If you add or remove elements through a valid range view, the original set can change too.