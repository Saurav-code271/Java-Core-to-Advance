package CollectionFramework.p03_set.p05_sortedset_navigableset;
// 1. The SortedSet interface defines three range-view methods: headSet(), tailSet(), and subSet().

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetRangeMethods03 {
    public static void main(String[] args) {
        SortedSet<Integer> numbers =
                new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println("Original: " + numbers);

        // Strictly less than 40
        System.out.println("headSet(40): "
                + numbers.headSet(40));

        // Greater than or equal to 30
        System.out.println("tailSet(30): "
                + numbers.tailSet(30));

        // From 20 inclusive to 50 exclusive
        System.out.println("subSet(20, 50): "
                + numbers.subSet(20, 50));
    }
}

// Output:

// Original: [10, 20, 30, 40, 50, 60]
// headSet(40): [10, 20, 30]
// tailSet(30): [30, 40, 50, 60]
// subSet(20, 50): [20, 30, 40]

// 2. Important: These are backed views, not independent copies. If you remove an element through one of these views,
// the original set is updated too.
