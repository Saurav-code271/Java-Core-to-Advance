package CollectionFramework.p02_list.LinkedList;
// 1. LinkedList implements both List and Deque. It is a doubly linked list, so each node links to its previous and next node.
// 2. Unlike an ArrayList, LinkedList does not provide constant-time indexed access.
// It can perform efficient insertions and removals at the ends, and through an existing iterator or node position.

import java.util.LinkedList;

public class LinkedListBasics01 {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Study Java");
        tasks.add("Practice DSA");
        tasks.add("Revise SQL");

        System.out.println("Tasks: " + tasks);
        System.out.println("Size: " + tasks.size());
        System.out.println("First: " + tasks.getFirst());
        System.out.println("Last: " + tasks.getLast());
    }
}

// 2. Output:
// Tasks: [Study Java, Practice DSA, Revise SQL]
// Size: 3
// First: Study Java
// Last: Revise SQL

