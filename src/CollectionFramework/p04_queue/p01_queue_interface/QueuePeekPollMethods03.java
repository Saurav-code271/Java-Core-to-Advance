package CollectionFramework.p04_queue.p01_queue_interface;
// 1. This class focuses on two essential methods: peek() and poll().

import java.util.LinkedList;
import java.util.Queue;

public class QueuePeekPollMethods03 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(100);
        queue.offer(200);
        queue.offer(300);

        System.out.println("Original queue: " + queue);

        System.out.println("Peek: " + queue.peek());
        System.out.println("After peek: " + queue);

        System.out.println("Poll: " + queue.poll());
        System.out.println("After poll: " + queue);

        Queue<Integer> emptyQueue = new LinkedList<>();

        System.out.println("Empty peek: " + emptyQueue.peek());
        System.out.println("Empty poll: " + emptyQueue.poll());
    }
}

// Output:

// Original queue: [100, 200, 300]
// Peek: 100
// After peek: [100, 200, 300]
// Poll: 100
// After poll: [200, 300]
// Empty peek: null
// Empty poll: null

// 2. Remember:

// 1. peek() observes the front element.
// 2. poll() removes the front element.
// 3.  Both return null if the queue is empty.
