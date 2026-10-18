package CollectionFramework.p03_set.p05_sortedset_navigableset;
// 1. This demonstrates that the SortedSet interface can reference a TreeSet object.

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetBasics01 {
    public static void main(String[] args) {
        SortedSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(10);

        System.out.println("SortedSet: " + numbers);
        System.out.println("Size: " + numbers.size());
        System.out.println("Contains 40: " + numbers.contains(40));
        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());
    }
}

// Expected Output:

// SortedSet: [10, 20, 40, 50]
// Size: 4
// Contains 40: true
// First: 10
// Last: 50

// 2. Remember: The variable's type is SortedSet, but the object is a TreeSet.
// The interface determines which methods you can call through that reference.

// 3. Understand the hierarchy:

//                Set
//          (Unique elements)
//                 ^
//             SortedSet
//        (Sorted order and range views)
//                 ^
//             NavigableSet
//    (Closest elements and reverse navigation)
//                 ^
//               TreeSet
//        (A common implementation)

// 4. SortedSet and NavigableSet are interfaces, not concrete classes. You can use a TreeSet object through either interface.