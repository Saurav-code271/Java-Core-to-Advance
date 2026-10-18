package CollectionFramework.p04_queue.p04_deque_interface;
// 1. What is the Deque interface? -> Deque means Double-Ended Queue.
// It extends the Queue interface and allows insertion and removal at both ends.

// 2. This class covers insertion, retrieval, and removal at both ends, including the exception-based and safe variants.

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMethodsPart01 {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        // 1. Insert elements
        deque.addFirst(20);
        deque.addLast(30);
        deque.addFirst(10);

        System.out.println("Deque: " + deque);

        // 2. Offer elements
        deque.offerFirst(5);
        deque.offerLast(40);

        System.out.println("After offer: " + deque);

        // 3. Retrieve without removing
        System.out.println("Get first: " + deque.getFirst());
        System.out.println("Get last: " + deque.getLast());

        System.out.println("Peek first: " + deque.peekFirst());
        System.out.println("Peek last: " + deque.peekLast());

        // 4. Remove from both ends
        System.out.println("Remove first: " + deque.removeFirst());
        System.out.println("Remove last: " + deque.removeLast());

        System.out.println("After remove: " + deque);

        // 5. Poll from both ends
        System.out.println("Poll first: " + deque.pollFirst());
        System.out.println("Poll last: " + deque.pollLast());

        System.out.println("Final deque: " + deque);
    }
}

// Output:

// Deque: [10, 20, 30]
// After offer: [5, 10, 20, 30, 40]
// Get first: 5
// Get last: 40
// Peek first: 5
// Peek last: 40
// Remove first: 5
// Remove last: 40
// After remove: [10, 20, 30]
// Poll first: 10
// Poll last: 30
// Final deque: [20]

// 3. Methods covered:

//    Method	                      Behavior if deque is empty

// 1. addFirst(e) / addLast(e)	      Inserts an element; may throw if insertion fails
// 2. offerFirst(e) / offerLast(e)	  Returns false if insertion fails
// 3. getFirst() / getLast()	      Throws NoSuchElementException
// 4. peekFirst() / peekLast()	      Returns null
// 5. removeFirst() / removeLast()	  Throws NoSuchElementException
// 6. pollFirst() / pollLast()	      Returns null