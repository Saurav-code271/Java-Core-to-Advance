package CollectionFramework.p03_set.p02_hashset;
// 1.  This example demonstrates how to benchmark basic operations.
// Results depend on your machine, JVM, and set size, so we won't assume a particular execution time.

import java.util.HashSet;

public class HashSetPerformance12 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        int size = 100_000;

        long startAdd = System.nanoTime();

        for (int i = 0; i < size; i++) {
            numbers.add(i);
        }

        long endAdd = System.nanoTime();

        long startSearch = System.nanoTime();

        for (int i = 0; i < size; i++) {
            numbers.contains(i);
        }

        long endSearch = System.nanoTime();

        System.out.println("Elements: " + numbers.size());
        System.out.println("Insertion time (ns): "
                + (endAdd - startAdd));
        System.out.println("Search time (ns): "
                + (endSearch - startSearch));
    }
}
