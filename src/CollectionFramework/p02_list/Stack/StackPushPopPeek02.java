package CollectionFramework.p02_list.Stack;

import java.util.Stack;

public class StackPushPopPeek02 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("After pop: " + stack);

        System.out.println("Pop: " + stack.pop());
        System.out.println("Current top: " + stack.peek());
    }
}

// 1. Output:
// Stack: [10, 20, 30]
// Peek: 30
// Pop: 30
// After pop: [10, 20]
// Pop: 20
// Current top: 10

// 2. Method	                 Meaning

// 1. push(value)	             Add to the top
// 2. pop()	                     Remove and return the top element
// 3. peek()	                 Return the top element without removing it
// 4. empty()	                 Check whether the stack is empty
// 5. search(value)              Find a value's 1-based position from the top

// 3. Calling pop() or peek() on an empty Stack throws EmptyStackException.
