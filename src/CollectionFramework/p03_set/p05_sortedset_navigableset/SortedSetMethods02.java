package CollectionFramework.p03_set.p05_sortedset_navigableset;
// 1. Learn first(), last(), and comparator()

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetMethods02 {
    public static void main(String[] args) {
        SortedSet<Integer> numbers = new TreeSet<>();

        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);

        System.out.println("Numbers: " + numbers);
        System.out.println("Smallest: " + numbers.first());
        System.out.println("Largest: " + numbers.last());

        // null means natural ordering
        System.out.println("Comparator: " + numbers.comparator());

        SortedSet<Integer> descending =
                new TreeSet<>(Comparator.reverseOrder());

        descending.addAll(numbers);

        System.out.println("Descending: " + descending);
        System.out.println("Descending comparator: "
                + (descending.comparator() != null));
    }
}

// Output:
// Numbers: [10, 20, 30, 40]
// Smallest: 10
// Largest: 40
// Comparator: null
// Descending: [40, 30, 20, 10]
// Descending comparator: true

// 2. Here, comparator() returns null when natural ordering is used. It returns the custom comparator when one is configured.