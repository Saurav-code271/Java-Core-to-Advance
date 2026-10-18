package CollectionFramework.p03_set.p05_sortedset_navigableset;
// 1. NavigableSet extends SortedSet and adds methods for finding nearby elements, accessing reverse-order views,
// and removing the smallest or largest element.

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetBasics01 {
    public static void main(String[] args) {
        NavigableSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("NavigableSet: " + numbers);

        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());

        System.out.println("Lower than 30: " + numbers.lower(30));
        System.out.println("Higher than 30: " + numbers.higher(30));

        System.out.println("Descending: " + numbers.descendingSet());
    }
}

// Output:
// NavigableSet: [10, 20, 30, 40, 50]
// First: 10
// Last: 50
// Lower than 30: 20
// Higher than 30: 40
// Descending: [50, 40, 30, 20, 10]

// 2. Key idea: the variable type is NavigableSet, while new TreeSet<>() creates the actual object.
// You can access all public methods defined by NavigableSet, SortedSet, and Set through this reference.
