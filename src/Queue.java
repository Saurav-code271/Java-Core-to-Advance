// In this we are implementing queue interface.

// Exploring  the queue methods.
// 1. we have implemented PriorityQueue in this.

import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        java.util.Queue<String> list = new PriorityQueue<>();
        list.offer("Saurav"); // return true if success, return false if not.
        list.offer("Kundan");
        list.offer("Ravi");
        list.add("Sahil"); // return true if success, throw exception if not.
        System.out.println(list);

        System.out.println(list.poll()); // return and remove head of queue, return null if empty.
        System.out.println(list.peek()); // return head of queue, return null if empty.
        System.out.println(list.element()); // return head of queue, throw exception if empty.
        System.out.println(list.remove()); // return and remove head of queue, throw exception if empty.
    }
}
