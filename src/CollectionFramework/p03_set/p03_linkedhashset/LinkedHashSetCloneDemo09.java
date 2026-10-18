package CollectionFramework.p03_set.p03_linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetCloneDemo09 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> original = new LinkedHashSet<>();

        original.add(10);
        original.add(20);
        original.add(30);

        LinkedHashSet<Integer> copy = (LinkedHashSet<Integer>) original.clone();

        copy.add(40);
        copy.remove(10);

        System.out.println("Original: " + original);
        System.out.println("Copy: " + copy);
    }
}

// Output:

// Original: [10, 20, 30]
// Copy: [20, 30, 40]

// 1. clone() produces a shallow copy, so changes to the set structure don't affect the original set.
// Mutable objects inside the sets may still be shared.