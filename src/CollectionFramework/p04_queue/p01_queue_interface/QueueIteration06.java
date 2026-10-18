package CollectionFramework.p04_queue.p01_queue_interface;
// 1. A queue can be traversed using an enhanced for loop or an iterator.

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueIteration06 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println("Using for-each:");

        for (Integer number : queue) {
            System.out.println(number);
        }

        System.out.println("Using iterator:");

        Iterator<Integer> iterator = queue.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Queue remains: " + queue);
    }
}

// Output:

// Using for-each:
// 10
// 20
// 30
// 40
// Using iterator:
// 10
// 20
// 30
// 40
// Queue remains: [10, 20, 30, 40]

// 2. Important: Iteration does not normally remove elements. Also, iteration order depends on the implementation.
// A LinkedList queue iterates in queue order, while a PriorityQueue iterator is not guaranteed to traverse elements in priority order.
