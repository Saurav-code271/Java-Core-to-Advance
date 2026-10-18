package CollectionFramework.p02_list.Stack;
// 1. A stack follows the LIFO principle: Last In, First Out. Imagine a stack of plates:
// the last plate placed on top is the first one removed.

// 2. Java provides the legacy Stack class, which extends Vector.
// For most new code, ArrayDeque is generally preferred when you need a stack.

import java.util.Stack;

public class StackBasics01 {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();

        books.push("Java");
        books.push("DSA");
        books.push("DBMS");

        System.out.println("Stack: " + books);
        System.out.println("Top element: " + books.peek());
        System.out.println("Size: " + books.size());
    }
}

// 1. Output:
// Stack: [Java, DSA, DBMS]
// Top element: DBMS
// Size: 3

// 2. push() adds an element to the top. peek() returns the top element without removing it.
