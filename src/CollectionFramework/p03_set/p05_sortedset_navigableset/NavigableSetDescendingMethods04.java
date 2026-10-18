package CollectionFramework.p03_set.p05_sortedset_navigableset;
// 1. This class teaches you how to display elements in descending order and iterate over them in reverse.

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDescendingMethods04 {
    public static void main(String[] args) {
        NavigableSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original set: " + numbers);

        System.out.println("Descending set: "
                + numbers.descendingSet());

        System.out.println("Descending iteration:");

        for (Integer number : numbers.descendingSet()) {
            System.out.println(number);
        }

        System.out.println("Original set after descending view: "+ numbers);

    }
}

// Output:

// Original set: [10, 20, 30, 40, 50]
// Descending set: [50, 40, 30, 20, 10]
// Descending iteration:
// 50
// 40
// 30
// 20
// 10
// Original set after descending view: [10, 20, 30, 40, 50]

// 2. Understand this carefully:

// 1. descendingSet() returns a reverse-order view of the set.
// 2. It does not simply permanently reverse the original set.
// 3. The original TreeSet remains in ascending order when printed normally.
// 4. Because it is a view, changes through the descending view can affect the original set.
