package CollectionFramework.p03_set.p01_set_interface;
// 1. Now learn addAll(), containsAll(), and removeIf().

import java.util.HashSet;
import java.util.Set;

public class SetBulkOperations03 {
    public static void main(String[] args) {
        Set<Integer> first = new HashSet<>();
        first.add(10);
        first.add(20);
        first.add(30);

        Set<Integer> second = new HashSet<>();
        second.add(30);
        second.add(40);
        second.add(50);

        // Add all elements from second into first
        first.addAll(second);
        System.out.println("After addAll: " + first);

        // Check whether all requested elements exist
        Set<Integer> check = new HashSet<>();
        check.add(10);
        check.add(30);

        System.out.println("Contains all: " + first.containsAll(check));

        // Remove even numbers
        first.removeIf(number -> number % 2 == 0);
        System.out.println("After removeIf: " + first);
    }
}

// Expected Output: order may vary.

// After addAll: [50, 20, 40, 10, 30]
// Contains all: true
// After removeIf: [...]

// 2. The last line contains the odd elements only: 10 is removed because it is even, as are 20, 30, 40, and 50.
// Therefore, the correct final output is:

// 3. This is a useful lesson: always check your predicate carefully.
// The condition number % 2 == 0 selects even numbers for removal.
