package CollectionFramework.p01_fundamentals;
// Concept: What is Collection?
// Collection is a core interface in the Java Collection Framework.
// It extends Iterable and defines common operations for groups of elements.

// Important methods include:

// Method	           Purpose

// 1. add()	          Add an element
// 2. remove()	      Remove an element
// 3. contains()	  Check whether an element exists
// 4. size()	      Count the elements
// 5. isEmpty()    	  Check whether the collection is empty
// 6. clear()	      Remove all elements

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterfaceDemo03 {
    public static void main(String[] args) {

        // Reference type: Collection
        // Actual object: ArrayList
        Collection<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        System.out.println("Languages: " + languages);

        System.out.println("Contains Java: " + languages.contains("Java"));

        System.out.println("Size: " + languages.size());

        languages.remove("Python");

        System.out.println("After removal: " + languages);

        System.out.println("Is empty: " + languages.isEmpty());

        languages.clear();

        System.out.println("After clear: " + languages);
        System.out.println("Is empty now: " + languages.isEmpty());
    }
}

// Expected Output:

// Languages: [Java, Python, C++]
// Contains Java: true
// Size: 3
// After removal: [Java, C++]
// Is empty: false
// After clear: []
// Is empty now: true

// @ Why write Collection<String> instead of ArrayList<String>?
// It has two parts:

// 1. Collection<String> — the reference type.
// 2. new ArrayList<>() — the actual object created.

// This is called programming to an interface. You can change the implementation to another compatible collection,
// such as a LinkedList, without changing code that only relies on Collection methods.
