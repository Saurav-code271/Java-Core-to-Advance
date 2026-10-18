package CollectionFramework.p02_list.Stack;
// 1. This final class demonstrates a modern alternative for stack operations.

import java.util.ArrayDeque;
import java.util.Deque;

public class StackVsArrayDeque04 {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        System.out.println("Top: " + stack.peek());
        System.out.println("Removed: " + stack.pop());

        System.out.println("After pop: " + stack);

        stack.push(40);

        System.out.println("After push: " + stack);
    }
}

// 2. Output:
// Stack: [30, 20, 10]
// Top: 30
// Removed: 30
// After pop: [20, 10]
// After push: [40, 20, 10]

// 3. ArrayDeque displays stack elements from top to bottom when used with push(). It doesn't allow null elements.
// Unlike Stack, it doesn't offer indexed access or the search() method.
