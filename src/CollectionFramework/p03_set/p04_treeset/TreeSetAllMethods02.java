package CollectionFramework.p03_set.p04_treeset;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetAllMethods02 {
    public static void main(String[] args) {
        // 1. CREATE AND ADD ELEMENTS
        System.out.println("=== 1. CREATE AND ADD ===");

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);
        numbers.add(20); // Duplicate ignored

        System.out.println("TreeSet: " + numbers);
        System.out.println("Add duplicate: " + numbers.add(20));
        System.out.println("Add new element: " + numbers.add(50));

        // 2. SIZE AND EMPTY CHECK
        System.out.println("\n=== 2. SIZE AND EMPTY CHECK ===");

        System.out.println("Size: " + numbers.size());
        System.out.println("Is empty? " + numbers.isEmpty());

        // 3. SEARCH METHODS
        System.out.println("\n=== 3. SEARCH METHODS ===");

        System.out.println("Contains 30? " + numbers.contains(30));
        System.out.println("Contains 99? " + numbers.contains(99));

        // 4. FIRST AND LAST
        System.out.println("\n=== 4. FIRST AND LAST ===");

        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());

        // 5. NAVIGATION METHODS
        System.out.println("\n=== 5. NAVIGATION METHODS ===");

        System.out.println("Lower than 30: " + numbers.lower(30));
        System.out.println("Higher than 30: " + numbers.higher(30));
        System.out.println("Floor of 30: " + numbers.floor(30));
        System.out.println("Ceiling of 25: " + numbers.ceiling(25));

        // 6. REMOVE METHODS
        System.out.println("\n=== 6. REMOVE METHODS ===");

        TreeSet<Integer> removeDemo = new TreeSet<>(numbers);

        System.out.println("Remove 20: " + removeDemo.remove(20));
        System.out.println("After remove: " + removeDemo);

        System.out.println("Poll first: " + removeDemo.pollFirst());
        System.out.println("After pollFirst: " + removeDemo);

        System.out.println("Poll last: " + removeDemo.pollLast());
        System.out.println("After pollLast: " + removeDemo);

        // 7. ITERATION METHODS
        System.out.println("\n=== 7. ITERATION ===");

        System.out.print("For-each: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }

        System.out.println();

        System.out.print("Iterator: ");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        System.out.print("Descending iterator: ");
        Iterator<Integer> descending = numbers.descendingIterator();
        while (descending.hasNext()) {
            System.out.print(descending.next() + " ");
        }

        System.out.println();

        // 8. RANGE METHODS
        System.out.println("\n=== 8. RANGE METHODS ===");

        System.out.println("headSet(30): " + numbers.headSet(30));
        System.out.println("tailSet(30): " + numbers.tailSet(30));
        System.out.println("subSet(20, 40): " + numbers.subSet(20, 40));

        // NavigableSet range overloads
        System.out.println("subSet(20, true, 40, true): "
                + numbers.subSet(20, true, 40, true)
        );

        // 9. DESCENDING SET
        System.out.println("\n=== 9. DESCENDING SET ===");

        System.out.println("Descending set: " + numbers.descendingSet());

        // 10. BULK OPERATIONS
        System.out.println("\n=== 10. BULK OPERATIONS ===");

        TreeSet<Integer> other =
                new TreeSet<>(Arrays.asList(20, 40, 60));

        TreeSet<Integer> union = new TreeSet<>(numbers);
        union.addAll(other);
        System.out.println("addAll (union): " + union);

        TreeSet<Integer> common = new TreeSet<>(numbers);
        common.retainAll(other);
        System.out.println("retainAll (common): " + common);

        TreeSet<Integer> difference = new TreeSet<>(numbers);
        difference.removeAll(other);
        System.out.println("removeAll: " + difference);

        System.out.println("containsAll: " + numbers.containsAll(other));

        // 11. REMOVE USING A CONDITION
        System.out.println("\n=== 11. REMOVE IF ===");

        TreeSet<Integer> evenOddDemo = new TreeSet<>(numbers);
        boolean changed = evenOddDemo.removeIf(n -> n % 2 == 0);

        System.out.println("Removed any even numbers? " + changed);
        System.out.println("After removeIf: " + evenOddDemo);

        // 12. ARRAYS
        System.out.println("\n=== 12. ARRAYS ===");

        Object[] array = numbers.toArray();
        System.out.println("Object array: " + Arrays.toString(array));

        Integer[] typedArray = numbers.toArray(new Integer[0]);
        System.out.println("Integer array: " + Arrays.toString(typedArray));

        // 13. CLONE
        System.out.println("\n=== 13. CLONE ===");

        TreeSet<Integer> copy = (TreeSet<Integer>) numbers.clone();
        copy.add(100);

        System.out.println("Original: " + numbers);
        System.out.println("Clone: " + copy);

        // 14. CUSTOM SORTING
        System.out.println("\n=== 14. CUSTOM SORTING ===");

        TreeSet<Integer> descendingOrder =
                new TreeSet<>(Comparator.reverseOrder());

        descendingOrder.addAll(numbers);

        System.out.println("Reverse order: " + descendingOrder);

        // 15. CLEAR
        System.out.println("\n=== 15. CLEAR ===");

        TreeSet<Integer> clearDemo = new TreeSet<>(numbers);
        clearDemo.clear();

        System.out.println("After clear: " + clearDemo);
        System.out.println("Is empty now? " + clearDemo.isEmpty());
    }
}

// 1. Important methods and their meanings:

// Method	                                  What it does
// 1. add(e)	Adds an element if not already present
// 2. addAll(c)	Adds elements from another collection
// 3. remove(e)	Removes a matching element
// 4. removeAll(c)	Removes elements found in another collection
// 5. retainAll(c)	Keeps only common elements
// 6. removeIf(condition)	Removes elements satisfying a condition
// 7. contains(e)	Checks whether an element exists
// 8. containsAll(c)	Checks whether all specified elements exist
// 9. first() / last()	Returns the smallest / largest element
// 10. lower(e) / higher(e)	Returns the closest strictly smaller / larger element
// 11. floor(e) / ceiling(e)	Returns the closest smaller-or-equal / larger-or-equal element
// 12. pollFirst() / pollLast()	Returns and removes the smallest / largest element
// 13. headSet(e)	Returns elements strictly smaller than e by default
// 14. tailSet(e)	Returns elements greater than or equal to e by default
// 15. subSet(a, b)	Returns elements from a inclusive to b exclusive
// 16. descendingSet()	Provides a reverse-order view
// 17. descendingIterator()	Iterates from largest to smallest
// 18. iterator()	Iterates in ascending order
// 19. toArray()	Converts elements into an array
// 20. clone()	Creates a shallow copy of the set
// 21. clear()	Removes every element
// 22. size() / isEmpty()	Checks the number of elements / whether the set is empty

// 3. Three things to remember:

// 1. TreeSet maintains sorted order, not insertion order.
// 2. lower() and higher() exclude the given value, whereas floor() and ceiling() can include it.
// 3. Range methods such as headSet(), tailSet(), and subSet() return backed views.
// Changes to those views can affect the original set.
