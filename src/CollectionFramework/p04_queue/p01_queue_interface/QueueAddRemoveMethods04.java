package CollectionFramework.p04_queue.p01_queue_interface;
// 1. Now compare add() with offer(), and remove() with poll().

import java.util.LinkedList;
import java.util.Queue;

public class QueueAddRemoveMethods04 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.offer(30);

        System.out.println("Queue: " + queue);

        System.out.println("Remove: " + queue.remove());
        System.out.println("Poll: " + queue.poll());

        System.out.println("Remaining queue: " + queue);

        Queue<Integer> emptyQueue = new LinkedList<>();

        System.out.println("Empty poll: " + emptyQueue.poll());

        try {
            System.out.println("Empty remove: " + emptyQueue.remove());
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Empty remove throws exception");
        }
    }
}

// Output:

// Queue: [10, 20, 30]
// Remove: 10
// Poll: 20
// Remaining queue: [30]
// Empty poll: null
// Empty remove throws exception

// 2. Important interview comparison:

// 1. Operation	        Returns failure result	        Throws exception

// 2. Insert	        offer() → false	                add()
// 3. Read front	    peek() → null	                element()
// 4. Remove front	    poll() → null	                remove()

// 3. For an empty queue, element() and remove() throw NoSuchElementException, while peek() and poll() return null.
