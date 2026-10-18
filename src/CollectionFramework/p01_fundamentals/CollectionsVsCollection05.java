package CollectionFramework.p01_fundamentals;
// Concept: Collection versus Collections:
// These two names look almost identical, but their purposes are different.

//   Collection	                               Collections
// 1. An interface	                           A utility class
// 2. Represents a group of elements	       Provides static helper methods
// 3. Implemented by classes such as ArrayList	Used to sort, reverse, shuffle, and more
// 4. Example: Collection<Integer>              Example: Collections.sort(numbers)

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsVsCollection05 {
    public static void main(String[] args) {

        Collection<Integer> numbers = new ArrayList<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        System.out.println("Original: " + numbers);

        // Collections.sort() requires a List
        ArrayList<Integer> list = new ArrayList<>(numbers);

        Collections.sort(list);
        System.out.println("Sorted: " + list);

        Collections.reverse(list);
        System.out.println("Reversed: " + list);

        System.out.println("Maximum: " + Collections.max(list));

        System.out.println("Minimum: " + Collections.min(list));
    }
}

// Expected Output:
// Original: [40, 10, 30, 20]
// Sorted: [10, 20, 30, 40]
// Reversed: [40, 30, 20, 10]
// Maximum: 40
// Minimum: 10

// Why did we create another ArrayList?
// Because Collections.sort() accepts a List, not an arbitrary Collection.

// Our variable numbers has the reference type Collection<Integer>, so it cannot be passed directly to Collections.sort().
// We created a new list using: -> ArrayList<Integer> list = new ArrayList<>(numbers);
// This copies the elements into a list that can be sorted. The original collection remains unchanged.

// Remember this distinction:
// 1. Collection — interface for groups of elements.
// 2. Collections — utility class with static methods for working with collections.