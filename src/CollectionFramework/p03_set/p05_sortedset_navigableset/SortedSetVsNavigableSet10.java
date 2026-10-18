package CollectionFramework.p03_set.p05_sortedset_navigableset;
// 1. This class compares the two interfaces you have just learned.

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetVsNavigableSet10 {
    public static void main(String[] args) {
        SortedSet<Integer> sorted = new TreeSet<>();
        sorted.add(10);
        sorted.add(20);
        sorted.add(30);
        sorted.add(40);
        sorted.add(50);

        System.out.println("SortedSet: " + sorted);
        System.out.println("First: " + sorted.first());
        System.out.println("Last: " + sorted.last());
        System.out.println("Head set: " + sorted.headSet(30));
        System.out.println("Tail set: " + sorted.tailSet(30));
        System.out.println("Sub set: " + sorted.subSet(20, 50));

        NavigableSet<Integer> navigable = new TreeSet<>();
        navigable.addAll(sorted);

        System.out.println("\nNavigableSet: " + navigable);
        System.out.println("Lower than 30: " + navigable.lower(30));
        System.out.println("Floor of 30: " + navigable.floor(30));
        System.out.println("Ceiling of 35: " + navigable.ceiling(35));
        System.out.println("Higher than 30: " + navigable.higher(30));
        System.out.println("Poll first: " + navigable.pollFirst());
        System.out.println("Poll last: " + navigable.pollLast());
        System.out.println("Descending set: " + navigable.descendingSet());
    }
}

// Output:

// SortedSet: [10, 20, 30, 40, 50]
// First: 10
// Last: 50
// Head set: [10, 20]
// Tail set: [30, 40, 50]
// Sub set: [20, 30, 40]
// NavigableSet: [10, 20, 30, 40, 50]
// Lower than 30: 20
// Floor of 30: 30
// Ceiling of 35: 40
// Higher than 30: 40
// Poll first: 10
// Poll last: 50
// Descending set: [40, 30, 20]

// 2. Quick comparison:

//    Feature	                     SortedSet	      NavigableSet
// 1. Maintains sorted order	     Yes	          Yes
// 2. first() and last()	         Yes	          Yes
// 3. headSet(),tailSet(),subSet()	 Yes	          Yes
// 4. lower(), floor()	             No	              Yes
// 5. ceiling(), higher()	         No	              Yes
// 6. pollFirst(), pollLast()	     No	              Yes
// 7. descendingSet()	             No	              Yes
// 8. Common implementation	         TreeSet	-      TreeSet