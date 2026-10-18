package CollectionFramework.p04_queue.p01_queue_interface;
// 1. This comparison is especially important because both classes implement Queue, but they behave differently.

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueLinkedListVsPriorityQueue08 {
    public static void main(String[] args) {
        Queue<Integer> linkedQueue = new LinkedList<>();
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        int[] values = {40, 10, 30, 20};

        for (int value : values) {
            linkedQueue.offer(value);
            priorityQueue.offer(value);
        }

        System.out.println("LinkedList queue: " + linkedQueue);
        System.out.println("PriorityQueue display: "
                + priorityQueue);

        System.out.println("LinkedList removal order:");

        while (!linkedQueue.isEmpty()) {
            System.out.print(linkedQueue.poll() + " ");
        }

        System.out.println("\nPriorityQueue removal order:");

        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.poll() + " ");
        }

        System.out.println();
    }
}

// Output:

// LinkedList queue: [40, 10, 30, 20]
// PriorityQueue display: [10, 20, 30, 40]
// LinkedList removal order:
// 40 10 30 20
// PriorityQueue removal order:
// 10 20 30 40

// 2. For this example, PriorityQueue uses natural ascending order, so its head is the smallest element.

// Feature	             LinkedList as a queue	                   PriorityQueue:

// 1. Removal order	     FIFO	                                   Priority order
// 2. Typical use	     Tasks processed in arrival order	       Tasks processed by priority
// 3. peek()	         First inserted element still present	   Highest-priority element
// 4. Iterator order	 Queue order	                           Not guaranteed to be sorted

// 3. The internal display of a PriorityQueue is not guaranteed to be fully sorted.
// The reliable way to observe its priority order is to repeatedly call poll().
