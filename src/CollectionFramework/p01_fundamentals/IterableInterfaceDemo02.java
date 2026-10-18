package CollectionFramework.p01_fundamentals;
// Concept: What is Iterable?
// Iterable is an interface that allows an object to be traversed, usually with the enhanced for loop.

// Many collection types implement Iterable, which is why you can write:

// Example -

// for (String name : names) {
//    System.out.println(name);
// }

import java.util.ArrayList;

public class IterableInterfaceDemo02 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Saurav");
        names.add("Rahul");
        names.add("Aman");

        // Enhanced for loop
        for (String name : names) {
            System.out.println(name);
        }
    }
}

// Expected Output:

// Saurav
// Rahul
// Aman

// @ What is happening?

// 1. We create an ArrayList containing three names.
// 2. The enhanced for loop visits each element.
// 3. The variable name holds the current element during each iteration.
// 4. The loop stops after all elements have been visited.

// The Iterable interface also provides the iterator() method,
// which gives you an Iterator for traversing elements manually.

// For Example:

// var iterator = names.iterator();
// while (iterator.hasNext()) {
//       System.out.println(iterator.next());
//       }

// Here, hasNext() checks whether another element exists, and next() returns the next element.
// Remember: Iterable is about traversal. It does not itself provide methods such as
// add() and remove() for modifying collection contents.