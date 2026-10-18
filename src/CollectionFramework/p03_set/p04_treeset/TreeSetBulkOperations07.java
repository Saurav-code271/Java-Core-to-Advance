package CollectionFramework.p03_set.p04_treeset;
// 1. Learn addAll(), removeAll(), retainAll(), and containsAll().

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetBulkOperations07 {
    public static void main(String[] args) {
        TreeSet<Integer> a =
                new TreeSet<>(Arrays.asList(10, 20, 30, 40));

        TreeSet<Integer> b =
                new TreeSet<>(Arrays.asList(30, 40, 50, 60));

        // Union: elements from both sets
        TreeSet<Integer> union = new TreeSet<>(a);
        union.addAll(b);
        System.out.println("Union: " + union);

        // Intersection: only common elements
        TreeSet<Integer> common = new TreeSet<>(a);
        common.retainAll(b);
        System.out.println("Intersection: " + common);

        // Difference: elements in a but not in b
        TreeSet<Integer> difference = new TreeSet<>(a);
        difference.removeAll(b);
        System.out.println("Difference: " + difference);

        // Check whether all elements of b exist in a
        System.out.println("a contains all b? "
                + a.containsAll(b));
    }
}

// Output:

// Union: [10, 20, 30, 40, 50, 60]
// Intersection: [30, 40]
// Difference: [10, 20]
// a contains all b? false