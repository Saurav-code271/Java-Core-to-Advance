package CollectionFramework.p03_set.p04_treeset;
// 1. With natural ordering, TreeSet cannot sort null, so attempting to add it throws NullPointerException

import java.util.TreeSet;

public class TreeSetNullDemo08 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);

        System.out.println("Before null: " + numbers);

        try {
            numbers.add(null);
        } catch (NullPointerException e) {
            System.out.println("Cannot add null with natural ordering.");
        }

        System.out.println("After attempt: " + numbers);
    }
}

// Output:

// Before null: [10, 20]
// Cannot add null with natural ordering.
// After attempt: [10, 20]

// 2. Remember: This example uses natural ordering.
// A custom comparator can define a special ordering for null, but in ordinary TreeSet usage, avoid null elements.