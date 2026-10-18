package CollectionFramework.p04_queue.p03_arraydeque;
// 1. What is ArrayDeque? -> ArrayDeque stands for Array Double-Ended Queue.
// You can add and remove elements from both the beginning and the end.

// 2. Important facts:

// 1. It implements both the Deque and Queue interfaces.
// 2. It is usually a good choice for implementing a stack or queue.
// 3. It allows duplicate elements but does not allow null.
// 4. It is not thread-safe by default.
// 5. Unlike PriorityQueue, it does not sort elements by priority.


import java.util.ArrayDeque;

public class ArrayDequeMethodsPart01 {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // 1. Add elements at both ends
        deque.addFirst(20);
        deque.addLast(30);
        deque.addFirst(10);
        deque.addLast(40);

        System.out.println("Deque: " + deque);

        // 2. Offer elements at both ends
        deque.offerFirst(5);
        deque.offerLast(50);

        System.out.println("After offer methods: " + deque);

        // 3. Access first and last elements
        System.out.println("First element: " + deque.getFirst());
        System.out.println("Last element: " + deque.getLast());

        // 4. Safely access the ends
        System.out.println("Peek first: " + deque.peekFirst());
        System.out.println("Peek last: " + deque.peekLast());

        // 5. Remove elements from both ends
        System.out.println("Removed first: " + deque.removeFirst());
        System.out.println("Removed last: " + deque.removeLast());

        System.out.println("After remove methods: " + deque);

        // 6. Safely remove elements from both ends
        System.out.println("Poll first: " + deque.pollFirst());
        System.out.println("Poll last: " + deque.pollLast());

        System.out.println("Final deque: " + deque);
    }
}

// Output:

// Deque: [10, 20, 30, 40]
// After offer methods: [5, 10, 20, 30, 40, 50]
// First element: 5
// Last element: 50
// Peek first: 5
// Peek last: 50
// Removed first: 5
// Removed last: 50
// After remove methods: [10, 20, 30, 40]
// Poll first: 10
// Poll last: 40
// Final deque: [20, 30]

// 3. Understand the methods:

//    Method	                       Purpose

// 1. addFirst(e)	                   Adds at the front
// 2. addLast(e)	                   Adds at the rear
// 3. offerFirst(e)	                   Offers an element at the front
// 4. offerLast(e)	                   Offers an element at the rear
// 5. getFirst() / getLast()	       Retrieves an end element; throws an exception if empty
// 6. peekFirst() / peekLast()	       Retrieves an end element; returns null if empty
// 7. removeFirst() / removeLast()	   Removes an end element; throws an exception if empty
// 8. pollFirst() / pollLast()	       Removes an end element; returns null if empty

// 4. Interview tip: getFirst() and peekFirst() both access the first element without removing it.
// Their key difference is how they behave when the deque is empty.