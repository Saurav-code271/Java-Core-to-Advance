package CollectionFramework.p03_set.p03_linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetBulkOperations07 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> a = new LinkedHashSet<>();
        a.add(10);
        a.add(20);
        a.add(30);

        LinkedHashSet<Integer> b = new LinkedHashSet<>();
        b.add(30);
        b.add(40);
        b.add(50);

        LinkedHashSet<Integer> union = new LinkedHashSet<>(a);
        union.addAll(b);

        LinkedHashSet<Integer> intersection =
                new LinkedHashSet<>(a);
        intersection.retainAll(b);

        LinkedHashSet<Integer> difference =
                new LinkedHashSet<>(a);
        difference.removeAll(b);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
        System.out.println("A - B: " + difference);
        System.out.println("Contains all: " + union.containsAll(a));
    }
}

// Output:

// Union: [10, 20, 30, 40, 50]
// Intersection: [30]
// A - B: [10, 20]
// Contains all: true
