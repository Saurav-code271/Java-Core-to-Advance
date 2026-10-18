package CollectionFramework.p04_queue.p01_queue_interface;
// 1. Learn how to search for an element, check the queue's size, and clear its contents.

import java.util.LinkedList;
import java.util.Queue;

public class QueueContainsClear07 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Java");
        queue.offer("SQL");
        queue.offer("Spring");

        System.out.println("Queue: " + queue);
        System.out.println("Contains SQL: "
                + queue.contains("SQL"));
        System.out.println("Contains Python: "
                + queue.contains("Python"));
        System.out.println("Size: " + queue.size());
        System.out.println("Is empty: " + queue.isEmpty());

        queue.clear();

        System.out.println("After clear: " + queue);
        System.out.println("Size after clear: " + queue.size());
        System.out.println("Is empty now: " + queue.isEmpty());
    }
}

// Output:

// Queue: [Java, SQL, Spring]
// Contains SQL: true
// Contains Python: false
// Size: 3
// Is empty: false
// After clear: []
// Size after clear: 0
// Is empty now: true

// 2. Methods covered:

// 1. contains(element) — checks membership.
// 2. size() — returns the number of elements.
// 3. isEmpty() — checks whether the queue is empty.
// 4. clear() — removes all elements.
