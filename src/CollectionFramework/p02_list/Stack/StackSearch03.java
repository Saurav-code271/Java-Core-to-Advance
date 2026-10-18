package CollectionFramework.p02_list.Stack;

import java.util.Stack;

public class StackSearch03 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        System.out.println("Stack: " + stack);
        System.out.println("Search C++: " + stack.search("C++"));
        System.out.println("Search Java: " + stack.search("Java"));
        System.out.println("Search Ruby: " + stack.search("Ruby"));
        System.out.println("Is empty: " + stack.empty());
    }
}

// 1. Output:
// Stack: [Java, Python, C++]
// Search C++: 1
// Search Java: 3
// Search Ruby: -1
// Is empty: false

// 2. The important detail is that search() counts positions from the top,
// starting at 1, not from index 0. If the element is absent, it returns -1.