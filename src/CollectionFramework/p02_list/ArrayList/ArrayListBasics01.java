package CollectionFramework.p02_list.ArrayList;
// 1. ArrayList is a resizable array implementation of the List interface.
// It preserves element order, allows duplicates, and supports access by index.

// 2. Learn how to create an ArrayList, add elements, access them, and find its size.

import java.util.ArrayList;

public class ArrayListBasics01 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Saurav");
        names.add("Rahul");
        names.add("Aman");
        names.add("Saurav"); // Duplicates are allowed

        System.out.println("Names: " + names);
        System.out.println("Size: " + names.size());
        System.out.println("First name: " + names.get(0));
        System.out.println("Last name: " + names.get(names.size() - 1));
    }
}

// 3. Output:
// Names: [Saurav, Rahul, Aman, Saurav]
// Size: 4
// First name: Saurav
// Last name: Saurav

// 4. Understand these methods:

// 1. add(element) — appends an element.
// 2. get(index) — retrieves an element by its zero-based index.
// 3. size() — returns the number of elements.
// 4. ArrayList<String> — stores strings. For integers, use ArrayList<Integer>.