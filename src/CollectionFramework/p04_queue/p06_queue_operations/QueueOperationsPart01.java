package CollectionFramework.p04_queue.p06_queue_operations;
// 1. This class covers basic queue operations, safe versus exception-based methods, iteration, searching, and clearing.

import java.util.LinkedList;
import java.util.Queue;

public class QueueOperationsPart01 {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // 1. Insert elements
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.add(40);

        System.out.println("Queue: " + queue);

        // 2. Access the front element
        System.out.println("Peek: " + queue.peek());
        System.out.println("Element: " + queue.element());

        // 3. Remove elements
        System.out.println("Poll: " + queue.poll());
        System.out.println("Remove: " + queue.remove());

        System.out.println("After removals: " + queue);

        // 4. Search and size
        System.out.println("Contains 40: " + queue.contains(40));
        System.out.println("Size: " + queue.size());
        System.out.println("Is empty: " + queue.isEmpty());

        // 5. Iterate through the queue
        System.out.print("Queue elements: ");
        for (Integer value : queue) {
            System.out.print(value + " ");
        }
        System.out.println();

        // 6. Clear the queue
        queue.clear();

        System.out.println("After clear: " + queue);
        System.out.println("Is empty now: " + queue.isEmpty());
    }
}

// Output:

// Queue: [10, 20, 30, 40]
// Peek: 10
// Element: 10
// Poll: 10
// Remove: 20
// After removals: [30, 40]
// Contains 40: true
// Size: 2
// Is empty: false
// Queue elements: 30 40
// After clear: []
// Is empty now: true

// 2. Methods to remember:

//    Method	                     Purpose

// 1. offer(e) / add(e)	             Insert an element
// 2. peek() / element()	         Read the front without removing it
// 3. poll() / remove()	             Remove and return the front
// 4. contains(e)	                 Check for a value
// 5. size()	                     Count the elements
// 6. isEmpty()	                     Check whether the queue is empty
// 7. clear()	                     Remove all elements

// 3. Interview rule: offer(), peek(), and poll() use special return values on failure or when empty.
// Their counterparts add(), element(), and remove() can throw exceptions.
