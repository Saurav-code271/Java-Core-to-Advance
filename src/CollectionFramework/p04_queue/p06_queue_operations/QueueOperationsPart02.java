package CollectionFramework.p04_queue.p06_queue_operations;
// 1. Now let's apply queues to practical scenarios and compare FIFO queues with priority-based processing.

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueOperationsPart02 {
    public static void main(String[] args) {
         // 1. Bulk operations
        Queue<Integer> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(10, 20, 30, 40));

        System.out.println("Original queue: " + queue);
        System.out.println("Contains all [10, 30]: "
                + queue.containsAll(Arrays.asList(10, 30)));

        queue.removeAll(Arrays.asList(20, 40));
        System.out.println("After removeAll: " + queue);

        queue.addAll(Arrays.asList(50, 60));
        queue.retainAll(Arrays.asList(10, 50));

        System.out.println("After retainAll: " + queue);

        // 2. FIFO task processing
        Queue<String> tasks = new LinkedList<>();
        tasks.offer("Compile code");
        tasks.offer("Run tests");
        tasks.offer("Generate report");

        System.out.println("\nFIFO task processing:");
        while (!tasks.isEmpty()) {
            System.out.println("Processing: " + tasks.poll());
        }

        // 3. Priority-based processing
        Queue<Integer> priorities = new PriorityQueue<>();
        priorities.addAll(Arrays.asList(40, 10, 30, 20));

        System.out.println("\nPriority-based processing:");
        while (!priorities.isEmpty()) {
            System.out.println("Processing priority: " + priorities.poll());
        }

        // 4. Simulate a customer waiting line
        Queue<String> customers = new LinkedList<>();
        customers.offer("Customer A");
        customers.offer("Customer B");
        customers.offer("Customer C");

        System.out.println("\nNext customer: " + customers.peek());
        System.out.println("Serving: " + customers.poll());
        System.out.println("Waiting line: " + customers);

        // 5. Check an empty queue safely
        Queue<Integer> emptyQueue = new LinkedList<>();

        System.out.println("\nEmpty queue peek: " + emptyQueue.peek());
        System.out.println("Empty queue poll: " + emptyQueue.poll());
    }
}

// Output:

// Original queue: [10, 20, 30, 40]
// Contains all [10, 30]: true
// After removeAll: [10, 30]
// After retainAll: [10, 50]

// FIFO task processing:
// Processing: Compile code
// Processing: Run tests
// Processing: Generate report

// Priority-based processing:
// Processing priority: 10
// Processing priority: 20
// Processing priority: 30
// Processing priority: 40

// Next customer: Customer A
// Serving: Customer A
// Waiting line: [Customer B, Customer C]

// Empty queue peek: null
// Empty queue poll: null
