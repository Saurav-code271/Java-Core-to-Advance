package CollectionFramework.p04_queue.p04_deque_interface;
// 1. This class demonstrates how Deque can act as a queue or stack, along with occurrence removal, iteration, and bulk operations.

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;

public class DequeMethodsPart02 {
    public static void main(String[] args) {

        // 1. Deque as a FIFO queue
        Deque<Integer> queue = new ArrayDeque<>();

        queue.offerLast(10);
        queue.offerLast(20);
        queue.offerLast(30);

        System.out.println("Queue: " + queue);
        System.out.println("Queue peek: " + queue.peek());
        System.out.println("Queue remove: " + queue.remove());

        System.out.println("Queue after removal: " + queue);

        // 2. Deque as a LIFO stack
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(100);
        stack.push(200);
        stack.push(300);

        System.out.println("Stack: " + stack);
        System.out.println("Stack peek: " + stack.peek());
        System.out.println("Stack pop: " + stack.pop());

        System.out.println("Stack after pop: " + stack);

        // 3. Remove a specific occurrence
        Deque<Integer> numbers = new ArrayDeque<>(
                Arrays.asList(10, 20, 30, 20, 40)
        );

        numbers.removeFirstOccurrence(20);
        System.out.println("After first occurrence removal: " + numbers);

        numbers.removeLastOccurrence(20);
        System.out.println("After last occurrence removal: " + numbers);

        // 4. Forward iteration
        System.out.print("Forward: ");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // 5. Reverse iteration
        System.out.print("Reverse: ");
        Iterator<Integer> iterator = numbers.descendingIterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 6. Search and size
        System.out.println("Contains 30: " + numbers.contains(30));
        System.out.println("Size: " + numbers.size());
        System.out.println("Is empty: " + numbers.isEmpty());

        // 7. Bulk operations
        Deque<Integer> extra = new ArrayDeque<>();
        extra.addAll(Arrays.asList(1, 2, 3, 4));

        extra.removeAll(Arrays.asList(2, 4));
        System.out.println("After removeAll: " + extra);

        extra.retainAll(Arrays.asList(1, 3));
        System.out.println("After retainAll: " + extra);

        // 8. Clear
        extra.clear();
        System.out.println("After clear: " + extra);
    }
}

// Output:

// Queue: [10, 20, 30]
// Queue peek: 10
// Queue remove: 10
// Queue after removal: [20, 30]
// Stack: [300, 200, 100]
// Stack peek: 300
// Stack pop: 300
// Stack after pop: [200, 100]
// After first occurrence removal: [10, 30, 20, 40]
// After last occurrence removal: [10, 30, 40]
// Forward: 10 30 40
// Reverse: 40 30 10
// Contains 30: true
// Size: 3
// Is empty: false
// After removeAll: [1, 3]
// After retainAll: [1, 3]
// After clear: []

// 2. Key interview notes:

// 1. Deque is an interface, so you cannot instantiate it directly with new Deque<>().
// 2. ArrayDeque is generally a good choice for stack and queue operations.
// 3. push() and pop() operate at the front, making a deque behave like a stack.
// 4. For FIFO queue behavior, add at the rear and remove from the front.
// 5. removeFirstOccurrence() and removeLastOccurrence() remove matching values, not elements by index.
// 6. Deque does not allow null in standard implementations such as ArrayDeque.