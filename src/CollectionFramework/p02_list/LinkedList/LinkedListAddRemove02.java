package CollectionFramework.p02_list.LinkedList;

import java.util.LinkedList;

public class LinkedListAddRemove02 {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();

        queue.offer("Task A");
        queue.offer("Task B");

        queue.offerFirst("Urgent task");
        queue.offerLast("Final task");

        System.out.println(queue);

        System.out.println("Peek first: " + queue.peekFirst());
        System.out.println("Peek last: " + queue.peekLast());

        System.out.println("Poll first: " + queue.pollFirst());
        System.out.println("Poll last: " + queue.pollLast());

        System.out.println("Remaining: " + queue);
    }
}

// 1. Output:
// [Urgent task, Task A, Task B, Final task]
// Peek first: Urgent task
// Peek last: Final task
// Poll first: Urgent task
// Poll last: Final task
// Remaining: [Task A, Task B]

// 2. Unlike getFirst(), peekFirst() returns null when the list is empty. Likewise,
// pollFirst() returns null instead of throwing an exception if no element exists.
