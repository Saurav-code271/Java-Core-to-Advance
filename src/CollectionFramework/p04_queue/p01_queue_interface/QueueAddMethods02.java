package CollectionFramework.p04_queue.p01_queue_interface;
// 1. Java provides two commonly used methods to insert an element: add() and offer().

import java.util.LinkedList;
import java.util.Queue;

public class QueueAddMethods02 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        System.out.println("Add Java: " + queue.add("Java"));
        System.out.println("Offer SQL: " + queue.offer("SQL"));
        System.out.println("Offer Spring: " + queue.offer("Spring"));

        System.out.println("Queue: " + queue);
    }
}

// Output:

// Add Java: true
// Offer SQL: true
// Offer Spring: true
// Queue: [Java, SQL, Spring]

// 2. Both methods successfully insert the elements here.

// 1. add() throws an exception if insertion fails.
// 2. offer() returns false if insertion fails.

// 3. For an unbounded LinkedList queue, insertion normally succeeds for these examples.
// The difference matters more with capacity-restricted queues.
