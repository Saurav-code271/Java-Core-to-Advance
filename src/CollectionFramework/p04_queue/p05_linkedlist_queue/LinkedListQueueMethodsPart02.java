package CollectionFramework.p04_queue.p05_linkedlist_queue;
// 1. This class demonstrates LinkedList's extra deque operations, iteration, bulk methods,
// array conversion, and a practical queue example.

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueMethodsPart02 {
    public static void main(String[] args) {
        // 1. LinkedList used as a double-ended queue
        LinkedList<Integer> deque = new LinkedList<>();

        deque.addFirst(20);
        deque.addLast(30);
        deque.addFirst(10);

        System.out.println("Deque: " + deque);
        System.out.println("First: " + deque.getFirst());
        System.out.println("Last: " + deque.getLast());

        System.out.println("Remove first: " + deque.removeFirst());
        System.out.println("Remove last: " + deque.removeLast());

        System.out.println("After end removals: " + deque);

        // 2. Occurrence-based removal
        LinkedList<Integer> numbers =
                new LinkedList<>(Arrays.asList(10, 20, 30, 20, 40));

        numbers.removeFirstOccurrence(20);
        System.out.println("After first occurrence: " + numbers);

        numbers.removeLastOccurrence(20);
        System.out.println("After last occurrence: " + numbers);

        // 3. Forward iteration
        System.out.print("Forward: ");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // 4. Reverse iteration
        System.out.print("Reverse: ");
        Iterator<Integer> iterator = numbers.descendingIterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 5. Bulk operations
        Queue<Integer> tasks = new LinkedList<>();
        tasks.addAll(Arrays.asList(1, 2, 3, 4));

        System.out.println("Tasks: " + tasks);
        System.out.println("Contains all [1, 3]: "
                + tasks.containsAll(Arrays.asList(1, 3)));

        tasks.removeAll(Arrays.asList(2, 4));
        System.out.println("After removeAll: " + tasks);

        tasks.retainAll(Arrays.asList(1, 3, 5));
        System.out.println("After retainAll: " + tasks);

        // 6. Convert to array
        Object[] array = tasks.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // 7. Practical example: customer service queue
        Queue<String> customers = new LinkedList<>();

        customers.offer("Customer A");
        customers.offer("Customer B");
        customers.offer("Customer C");

        System.out.println("Next customer: " + customers.poll());
        System.out.println("Waiting customers: " + customers);
    }
}

// Output:

// Deque: [10, 20, 30]
// First: 10
// Last: 30
// Remove first: 10
// Remove last: 30
// After end removals: [20]
// After first occurrence: [10, 30, 20, 40]
// After last occurrence: [10, 30, 40]
// Forward: 10 30 40
// Reverse: 40 30 10
// Tasks: [1, 2, 3, 4]
// Contains all [1, 3]: true
// After removeAll: [1, 3]
// After retainAll: [1, 3]
// Array: [1, 3]
// Next customer: Customer A
// Waiting customers: [Customer B, Customer C]
