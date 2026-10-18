package CollectionFramework.p03_set.p05_sortedset_navigableset;
// 1. Now create one combined reference class containing the most important NavigableSet methods.
// Keep this class for revision before interviews.

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetAllMethods11 {
    public static void main(String[] args) {
        NavigableSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Basic methods
        System.out.println("Set: " + numbers);
        System.out.println("Size: " + numbers.size());
        System.out.println("Contains 30: " + numbers.contains(30));

        // First and last
        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());

        // Navigation methods
        System.out.println("Lower 30: " + numbers.lower(30));
        System.out.println("Floor 30: " + numbers.floor(30));
        System.out.println("Ceiling 35: " + numbers.ceiling(35));
        System.out.println("Higher 30: " + numbers.higher(30));

        // Range methods
        System.out.println("HeadSet: " + numbers.headSet(30, true));
        System.out.println("TailSet: " + numbers.tailSet(30, false));
        System.out.println("SubSet: "
                + numbers.subSet(20, true, 40, false));

        // Reverse order
        System.out.println("Descending: " + numbers.descendingSet());

        // Poll methods on a separate set
        NavigableSet<Integer> copy = new TreeSet<>(numbers);

        System.out.println("Poll first: " + copy.pollFirst());
        System.out.println("Poll last: " + copy.pollLast());
        System.out.println("After polling: " + copy);

        // Search for a missing boundary
        System.out.println("Lower than 5: " + numbers.lower(5));
        System.out.println("Ceiling of 55: " + numbers.ceiling(55));
    }
}

// Output:

// Set: [10, 20, 30, 40, 50]
// Size: 5
// Contains 30: true
// First: 10
// Last: 50
// Lower 30: 20
// Floor 30: 30
// Ceiling 35: 40
// Higher 30: 40
// HeadSet: [10, 20, 30]
// TailSet: [40, 50]
// SubSet: [20, 30]
// Descending: [50, 40, 30, 20, 10]
// Poll first: 10
// Poll last: 50
// After polling: [20, 30, 40]
// Lower than 5: null
// Ceiling of 55: null
