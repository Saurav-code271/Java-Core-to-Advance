package CollectionFramework.p04_queue.p02_priorityqueue;
// 1. Covers iteration, arrays, bulk operations, custom comparators,
// cloning through a constructor, and a practical priority-order example.

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueMethodsPart02 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue =
                new PriorityQueue<>(Arrays.asList(50, 20, 40, 10, 30));

        // 1. Iteration
        System.out.println("Queue iteration:");
        for (Integer value : queue) {
            System.out.print(value + " ");
        }
        System.out.println();

        // 2. Iterator
        System.out.println("Using iterator:");
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 3. toArray()
        Object[] array = queue.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // 4. addAll()
        PriorityQueue<Integer> extra = new PriorityQueue<>();
        extra.addAll(Arrays.asList(60, 70, 80));
        System.out.println("Extra queue: " + extra);

        // 5. containsAll()
        System.out.println("Contains all [60, 70]: "
                + extra.containsAll(Arrays.asList(60, 70)));

        // 6. removeAll()
        extra.removeAll(Arrays.asList(60, 80));
        System.out.println("After removeAll: " + extra);

        // 7. retainAll()
        extra.retainAll(Arrays.asList(70, 90));
        System.out.println("After retainAll: " + extra);

        // 8. Custom comparator: largest number first
        PriorityQueue<Integer> maxQueue =
                new PriorityQueue<>(Collections.reverseOrder());

        maxQueue.addAll(Arrays.asList(10, 50, 30, 20));

        System.out.println("Max-priority queue removals:");
        while (!maxQueue.isEmpty()) {
            System.out.print(maxQueue.poll() + " ");
        }
        System.out.println();

        // 9. Copy constructor
        PriorityQueue<Integer> original =
                new PriorityQueue<>(Arrays.asList(5, 15, 10));

        PriorityQueue<Integer> copy = new PriorityQueue<>(original);

        System.out.println("Original head: " + original.peek());
        System.out.println("Copy head: " + copy.peek());

        // 10. Remove a specific element
        original.remove(Integer.valueOf(10));
        System.out.println("Original after removing 10: " + original);

        // 11. Practical example: tasks by priority
        PriorityQueue<Integer> taskPriorities = new PriorityQueue<>();
        taskPriorities.add(3); // Low priority
        taskPriorities.add(1); // High priority
        taskPriorities.add(2); // Medium priority

        System.out.println("Task processing order:");
        while (!taskPriorities.isEmpty()) {
            System.out.println("Priority " + taskPriorities.poll());
        }
    }
}

// Output: Expected output (iteration and internal queue display order may vary):

// Queue iteration:
// 10 20 40 50 30
// Using iterator:
// 10 20 40 50 30
// Array: [10, 20, 40, 50, 30]
// Extra queue: [60, 70, 80]
// Contains all [60, 70]: true
// After removeAll: [70]
// After retainAll: [70]
// Max-priority queue removals:
// 50 30 20 10
// Original head: 5
// Copy head: 5
// Original after removing 10: [5, 15]
// Task processing order:
// Priority 1
// Priority 2
// Priority 3

// 2. Important notes:

// 1. PriorityQueue iteration does not guarantee sorted order. Repeated poll() calls do.
// 2. remove(Object) removes a specific matching element; remove() without an argument removes the head.
// 3. The copy constructor creates a separate queue, not a live view of the original.
// 4. A PriorityQueue does not provide a clone() method as part of its public API;
// using its copy constructor is a convenient way to make a shallow copy.


