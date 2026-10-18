package CollectionFramework.p03_set.p05_sortedset_navigableset;
// 1. The two polling methods retrieve and remove the boundary elements.

// 1. pollFirst() — removes and returns the smallest element.
// 2. pollLast() — removes and returns the largest element.

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetPollMethods03 {
    public static void main(String[] args) {
        NavigableSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original: " + numbers);

        // Retrieve and remove the smallest
        Integer smallest = numbers.pollFirst();

        System.out.println("Removed first: " + smallest);
        System.out.println("After pollFirst: " + numbers);

        // Retrieve and remove the largest
        Integer largest = numbers.pollLast();

        System.out.println("Removed last: " + largest);
        System.out.println("After pollLast: " + numbers);

        // Remove remaining boundary elements
        System.out.println("Next first: " + numbers.pollFirst());
        System.out.println("Next last: " + numbers.pollLast());

        System.out.println("Remaining: " + numbers);

        // Polling an empty set
        System.out.println("Poll empty set: " + numbers.pollFirst());
    }
}

// Output:

// Original: [10, 20, 30, 40, 50]
// Removed first: 10
// After pollFirst: [20, 30, 40, 50]
// Removed last: 50
// After pollLast: [20, 30, 40]
// Next first: 20
// Next last: 40
// Remaining: [30]
// Poll empty set: 30

// 2. Correction to the last two lines: after the earlier operations, the set contains [30],
// so pollFirst() returns 30 and empties the set. To demonstrate polling an empty set correctly, add one more call:

// System.out.println("Poll empty set: " + numbers.pollFirst());
