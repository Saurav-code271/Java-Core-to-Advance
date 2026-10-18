package CollectionFramework.p04_queue.p02_priorityqueue;
// 1. Covers basics, constructors, insertion, access, removal, searching, size, and empty checks.

import java.util.PriorityQueue;

public class PriorityQueueMethodsPart01 {
    public static void main(String[] args) {
        // 1. Constructors
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // 2. add()
        queue.add(40);
        queue.add(10);

        // 3. offer()
        queue.offer(30);
        queue.offer(20);

        System.out.println("Queue: " + queue);

        // 4. peek(): read head without removing
        System.out.println("Peek: " + queue.peek());

        // 5. element(): read head, throws if empty
        System.out.println("Element: " + queue.element());

        // 6. poll(): remove head, returns null if empty
        System.out.println("Poll: " + queue.poll());

        // 7. remove(): remove head, throws if empty
        System.out.println("Remove: " + queue.remove());

        // 8. contains()
        System.out.println("Contains 30: " + queue.contains(30));

        // 9. size()
        System.out.println("Size: " + queue.size());

        // 10. isEmpty()
        System.out.println("Is empty: " + queue.isEmpty());

        // 11. clear()
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
// Contains 30: true
// Size: 2
// Is empty: false
// After clear: []
// Is empty now: true


