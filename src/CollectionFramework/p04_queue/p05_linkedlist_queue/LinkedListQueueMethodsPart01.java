package CollectionFramework.p04_queue.p05_linkedlist_queue;
// 1. Concept: LinkedList as a Queue -> Java's LinkedList implements List, Deque, and Queue,
// so one object can support indexed list operations, FIFO queue operations, and double-ended operations.

// 2. Points:

// 1. FIFO: First In, First Out.
// 2. offer() or add() inserts at the rear.
// 3. poll() or remove() removes from the front.
// 4. Unlike ArrayDeque, LinkedList permits null elements,
// although using null in queues is generally best avoided because poll() also returns null when empty.

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueMethodsPart01 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // 1. Add elements
        queue.add(10);
        queue.add(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println("Queue: " + queue);

        // 2. Access the front element
        System.out.println("Element: " + queue.element());
        System.out.println("Peek: " + queue.peek());

        // 3. Remove elements
        System.out.println("Remove: " + queue.remove());
        System.out.println("Poll: " + queue.poll());

        System.out.println("Queue after removals: " + queue);

        // 4. Search and size
        System.out.println("Contains 40: " + queue.contains(40));
        System.out.println("Size: " + queue.size());
        System.out.println("Is empty: " + queue.isEmpty());

        // 5. Clear the queue
        queue.clear();

        System.out.println("After clear: " + queue);
        System.out.println("Is empty now: " + queue.isEmpty());
    }
}

// Output:

// Queue: [10, 20, 30, 40]
// Element: 10
// Peek: 10
// Remove: 10
// Poll: 20
// Queue after removals: [30, 40]
// Contains 40: true
// Size: 2
// Is empty: false
// After clear: []
// Is empty now: true

// 3. Methods covered:

//    Method	              Purpose
// 1. add(e)	              Adds an element; throws if insertion fails
// 2. offer(e)	              Offers an element; returns false if insertion fails
// 3. element()               Reads the head; throws if empty
// 4. peek()	              Reads the head; returns null if empty
// 5. remove()	              Removes the head; throws if empty
// 6. poll()	              Removes the head; returns null if empty
// 7. contains(e)	          Checks whether a value exists
// 8. size()	              Returns the number of elements
// 9. isEmpty()	              Checks whether the queue is empty
// 10. clear()	              Removes all elements

// 4. Interview tip: remove() and poll() both remove the head, but their empty-queue behavior differs.
// This is a frequent Java Collections interview question.
