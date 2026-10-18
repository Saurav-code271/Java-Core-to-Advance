package CollectionFramework.p02_list.Vector;
// 1. Vector is a resizable array similar to ArrayList.
// Its main historical distinction is that its individual methods are synchronized.
// This can be useful in some concurrent scenarios, but synchronization alone does not make a sequence of multiple operations atomic.

import java.util.Vector;

public class VectorBasics01 {
    public static void main(String[] args) {
        Vector<String> languages = new Vector<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        System.out.println("Vector: " + languages);
        System.out.println("Size: " + languages.size());
        System.out.println("Capacity: " + languages.capacity());

        languages.add("JavaScript");

        System.out.println("Updated Vector: " + languages);
        System.out.println("Contains Java: " + languages.contains("Java"));
    }
}

// 1. Output:
// Vector: [Java, Python, C++]
// Size: 3
// Capacity: 10
// Updated Vector: [Java, Python, C++, JavaScript]
// Contains Java: true

// 2. A newly constructed Vector with its default constructor starts with a capacity of 10.
// Size means the number of stored elements; capacity means the current backing-array capacity. Capacity can grow as needed.

// 3. When you need a normal resizable list, ArrayList is usually the preferred choice.
