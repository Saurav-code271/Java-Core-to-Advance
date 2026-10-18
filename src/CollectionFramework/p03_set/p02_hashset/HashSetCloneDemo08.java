package CollectionFramework.p03_set.p02_hashset;

import java.util.HashSet;

// 1. The clone() method creates a shallow copy of a HashSet.
public class HashSetCloneDemo08 {
    public static void main(String[] args) {
        HashSet<Integer> original = new HashSet<>();

        original.add(10);
        original.add(20);
        original.add(30);

        HashSet<Integer> copy = (HashSet<Integer>) original.clone();

        System.out.println("Original: " + original);
        System.out.println("Copy: " + copy);

        copy.add(40);
        copy.remove(10);

        System.out.println("Modified copy: " + copy);
        System.out.println("Original unchanged: " + original);
    }
}

// Expected output (order may vary):
// Original: [20, 10, 30]
// Copy: [20, 10, 30]
// Modified copy: [20, 30, 40]
// Original unchanged: [20, 10, 30]

// 2. The two sets have separate internal structures. However, for mutable custom objects,
// a shallow copy still shares the object references.
