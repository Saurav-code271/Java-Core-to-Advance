package CollectionFramework.p03_set.p05_sortedset_navigableset;
// 1. A TreeSet normally uses natural ordering. You can change that order by providing a Comparator.

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetComparatorDemo06 {
    public static void main(String[] args) {
        NavigableSet<String> names =
                new TreeSet<>(Comparator.reverseOrder());

        names.add("Saurav");
        names.add("Aman");
        names.add("Priya");
        names.add("Ravi");
        names.add("Neha");

        System.out.println("Names: " + names);

        System.out.println("Comparator: "
                + names.comparator());

        System.out.println("First: " + names.first());
        System.out.println("Last: " + names.last());

        System.out.println("Lower than Priya: "
                + names.lower("Priya"));

        System.out.println("Higher than Priya: "
                + names.higher("Priya"));

        System.out.println("Descending view: "
                + names.descendingSet());
    }
}

// Output:

// Names: [Saurav, Ravi, Priya, Neha, Aman]
// Comparator: java.util.Collections$ReverseComparator@...
// First: Saurav
// Last: Aman
// Lower than Priya: Ravi
// Higher than Priya: Neha
// Descending view: [Aman, Neha, Priya, Ravi, Saurav]

// 2. The exact text printed for the comparator object can vary by Java implementation, so don't worry if that line differs.
// 3. Important: lower() and higher() follow the set's ordering, not necessarily normal alphabetical order.
// Here, the set uses reverse alphabetical ordering.

// 1. lower("Priya") → Ravi, the element before Priya in the set's ordering.
// 2. higher("Priya") → Neha, the element after Priya in the set's ordering.
// 3. descendingSet() reverses that ordering.
