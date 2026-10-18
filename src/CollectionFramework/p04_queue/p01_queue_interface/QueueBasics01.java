package CollectionFramework.p04_queue.p01_queue_interface;
// 1. First concept: What is a Queue? -> A Queue generally follows FIFO — First In, First Out.
// 2. The main interface is Queue<E>. Common implementations include LinkedList and PriorityQueue,
// though PriorityQueue removes elements according to priority rather than ordinary FIFO order.

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics01 {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();

        // Adding elements
        numbers.offer(10);
        numbers.offer(20);
        numbers.offer(30);

        System.out.println("Queue: " + numbers);
        System.out.println("Size: " + numbers.size());
        System.out.println("Is empty: " + numbers.isEmpty());
        System.out.println("Front element: " + numbers.peek());

        // Removing the front element
        System.out.println("Removed: " + numbers.poll());

        System.out.println("Queue after removal: " + numbers);
    }
}

// Output:

// Queue: [10, 20, 30]
// Size: 3
// Is empty: false
// Front element: 10
// Removed: 10
// Queue after removal: [20, 30]

// 3. Understand the methods:

// 1. Method	             Purpose

// 2. offer(element)	     Adds an element; returns false if it cannot be added
// 3. peek()	             Reads the front element without removing it
// 4. poll()	             Removes and returns the front element
// 5. size()	             Returns the number of elements
// 6. isEmpty()	             Checks whether the queue is empty

// 4. Interview point: Queue is an interface, so you need a concrete implementation such as LinkedList or PriorityQueue to create a queue object.

