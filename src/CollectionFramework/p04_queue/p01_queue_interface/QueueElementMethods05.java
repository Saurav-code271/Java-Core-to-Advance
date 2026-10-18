package CollectionFramework.p04_queue.p01_queue_interface;
// 1. The element() method returns the front element without removing it. It is similar to peek(),
// but there is one important difference when the queue is empty.

import java.util.LinkedList;
import java.util.Queue;

public class QueueElementMethods05 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Java");
        queue.offer("SQL");
        queue.offer("Spring Boot");

        System.out.println("Queue: " + queue);
        System.out.println("Element: " + queue.element());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Queue after reading: " + queue);

        Queue<String> emptyQueue = new LinkedList<>();

        System.out.println("Empty peek: " + emptyQueue.peek());

        try {
            System.out.println("Empty element: "
                    + emptyQueue.element());
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Empty element throws exception");
        }
    }
}

// Output:

// Queue: [Java, SQL, Spring Boot]
// Element: Java
// Peek: Java
// Queue after reading: [Java, SQL, Spring Boot]
// Empty peek: null
// Empty element throws exception

// 2. Interview point: element() and peek() both read the front element.
// element() throws NoSuchElementException when empty, whereas peek() returns null.
