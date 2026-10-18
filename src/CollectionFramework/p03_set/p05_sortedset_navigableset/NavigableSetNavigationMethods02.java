package CollectionFramework.p03_set.p05_sortedset_navigableset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetNavigationMethods02 {
    public static void main(String[] args) {
        NavigableSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Set: " + numbers);

        // Strictly smaller
        System.out.println("lower(30): " + numbers.lower(30));

        // Smaller than or equal to
        System.out.println("floor(30): " + numbers.floor(30));

        // Greater than or equal to
        System.out.println("ceiling(30): " + numbers.ceiling(30));

        // Strictly greater
        System.out.println("higher(30): " + numbers.higher(30));

        // Search for a value not present
        System.out.println("floor(35): " + numbers.floor(35));
        System.out.println("ceiling(35): " + numbers.ceiling(35));

        // No qualifying element
        System.out.println("lower(10): " + numbers.lower(10));
        System.out.println("higher(50): " + numbers.higher(50));
    }
}

// Expected Output:

// Set: [10, 20, 30, 40, 50]
// lower(30): 20
// floor(30): 30
// ceiling(30): 30
// higher(30): 40
// floor(35): 30
// ceiling(35): 40
// lower(10): null
// higher(50): null

// 1. This is one of the most important classes in this package. You'll learn four methods:

// 1. lower(e) — greatest element strictly smaller than e.
// 2. floor(e) — greatest element smaller than or equal to e.
// 3. ceiling(e) — smallest element greater than or equal to e.
// 4. higher(e) — smallest element strictly greater than e.
