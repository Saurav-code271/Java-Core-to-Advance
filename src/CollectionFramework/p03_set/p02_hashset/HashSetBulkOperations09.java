package CollectionFramework.p03_set.p02_hashset;

import java.util.HashSet;

// 1. Bulk methods operate on multiple elements at once.
public class HashSetBulkOperations09 {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        a.add(10);
        a.add(20);
        a.add(30);

        HashSet<Integer> b = new HashSet<>();
        b.add(30);
        b.add(40);
        b.add(50);

        HashSet<Integer> union = new HashSet<>(a);
        union.addAll(b);

        HashSet<Integer> common = new HashSet<>(a);
        common.retainAll(b);

        HashSet<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + common);
        System.out.println("A - B: " + difference);
        System.out.println("Contains all: " + union.containsAll(a));
    }
}

// Output (order may vary):

// Union: [10, 20, 30, 40, 50]
// Intersection: [30]
// A - B: [10, 20]
// Contains all: true

// 2. Method	         Meaning
// 1. addAll()	         Union
// 2. retainAll()	     Intersection
// 3. removeAll()	     Difference
// 4. containsAll()	     Checks whether all elements are present
