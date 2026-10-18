package CollectionFramework.p03_set.p04_treeset;
// 1. This class teaches headSet(), tailSet(), subSet(), and descendingSet().

import java.util.TreeSet;

public class TreeSetRangeMethods03 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println("Original: " + numbers);

        // Elements strictly less than 40
        System.out.println("headSet(40): "
                + numbers.headSet(40));

        // Elements greater than or equal to 30
        System.out.println("tailSet(30): "
                + numbers.tailSet(30));

        // From 20 inclusive to 50 exclusive
        System.out.println("subSet(20, 50): "
                + numbers.subSet(20, 50));

        // Both boundaries inclusive
        System.out.println("subSet(20, true, 50, true): "
                + numbers.subSet(20, true, 50, true));

        // Both boundaries exclusive
        System.out.println("subSet(20, false, 50, false): "
                + numbers.subSet(20, false, 50, false));

        // Reverse-order view
        System.out.println("descendingSet(): "
                + numbers.descendingSet());
    }
}

// Expected output:

// Original: [10, 20, 30, 40, 50, 60]
// headSet(40): [10, 20, 30]
// tailSet(30): [30, 40, 50, 60]
// subSet(20, 50): [20, 30, 40]
// subSet(20, true, 50, true): [20, 30, 40, 50]
// subSet(20, false, 50, false): [30, 40]
// descendingSet(): [60, 50, 40, 30, 20, 10]

// 2. Understand the boundaries:

// 1.  headSet(40) excludes 40.
// 2. tailSet(30) includes 30 by default.
// 3. subSet(20, 50) includes 20 but excludes 50.
// 4. The four-argument subSet() lets you choose whether either boundary is included.
// 5. descendingSet() returns a reverse-order view, not an independent copy. Changes to the view can affect the original set.
