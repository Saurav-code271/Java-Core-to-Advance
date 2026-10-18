package CollectionFramework.p04_queue.p03_arraydeque;
// 1. This class covers stack operations, searching, iteration, bulk operations, and converting the deque into an array.

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayDequeMethodsPart02 {
    public static void main(String[] args) {
        // 1. ArrayDeque as a stack
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);
        System.out.println("Stack peek: " + stack.peek());
        System.out.println("Stack pop: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // 2. Search and basic operations
        System.out.println("Contains 10: " + stack.contains(10));
        System.out.println("Size: " + stack.size());
        System.out.println("Is empty: " + stack.isEmpty());

        // 3. Remove a specific occurrence
        ArrayDeque<Integer> numbers = new ArrayDeque<>(
                Arrays.asList(10, 20, 30, 20, 40)
        );

        numbers.removeFirstOccurrence(20);
        System.out.println("After removing first 20: " + numbers);

        numbers.removeLastOccurrence(20);
        System.out.println("After removing last 20: " + numbers);

        // 4. Normal iteration
        System.out.print("Forward iteration: ");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // 5. Descending iteration
        System.out.print("Descending iteration: ");
        Iterator<Integer> iterator = numbers.descendingIterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 6. Convert to array
        Object[] array = numbers.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // 7. Bulk operations
        ArrayDeque<Integer> extra = new ArrayDeque<>();
        extra.addAll(Arrays.asList(50, 60, 70));

        System.out.println("Extra deque: " + extra);
        System.out.println("Contains all [50, 60]: "
                + extra.containsAll(Arrays.asList(50, 60)));

        extra.removeAll(Arrays.asList(50, 70));
        System.out.println("After removeAll: " + extra);

        extra.addAll(Arrays.asList(80, 90));
        extra.retainAll(Arrays.asList(60, 90));
        System.out.println("After retainAll: " + extra);

        // 8. Clear the deque
        extra.clear();
        System.out.println("After clear: " + extra);
        System.out.println("Is empty now: " + extra.isEmpty());
    }
}

// Output:

// Stack: [30, 20, 10]
// Stack peek: 30
// Stack pop: 30
// Stack after pop: [20, 10]
// Contains 10: true
// Size: 2
// Is empty: false
// After removing first 20: [10, 30, 20, 40]
// After removing last 20: [10, 30, 40]
// Forward iteration: 10 30 40
// Descending iteration: 40 30 10
// Array: [10, 30, 40]
// Extra deque: [50, 60, 70]
// Contains all [50, 60]: true
// After removeAll: [60]
// After retainAll: [60, 90]
// After clear: []
// Is empty now: true

// 2.  Understand the additional methods:

//    Method	                        Meaning

// 1. push(e)	                        Adds an element to the front, like a stack push
// 2. pop()	                            Removes and returns the front element; throws if empty
// 3. peek()	                        Returns the front element without removing it; returns null if empty
// 4. contains(e)	                    Checks whether an element exists
// 5. removeFirstOccurrence(e)	        Removes the first matching occurrence from the front
// 6. removeLastOccurrence(e)	        Removes the last matching occurrence from the front-to-rear sequence
// 7. descendingIterator()	            Iterates from the rear toward the front
// 8. toArray()	                        Converts the deque into an array
// 9. addAll(c)	                        Adds all elements from another collection
// 10. removeAll(c)	                    Removes all elements that are also in the given collection
// 11. retainAll(c)                 	Keeps only elements present in the given collection
// 12. clear()	                        Removes every element

// 3. Important interview comparison:

// Feature	                      ArrayDeque	          PriorityQueue

// 1. Main behavior	              Double-ended queue	  Priority-based queue
// 2. Add/remove at both ends	  Yes	                  No
// 3. Stack implementation	      Excellent choice	      Not suitable
// 4. Allows null	              No	      -           No
// 5. Sorted iteration	          No	      -           No
// 6. Thread-safe by default	  No	      -           No

// 4. Remember: ArrayDeque can behave as a FIFO queue or a LIFO stack. The methods you choose determine the behavior.
