package CollectionFramework.p03_set.p03_linkedhashset;
// 1. LinkedHashSet is a class that implements Set. It maintains unique elements and preserves their insertion order.

import java.util.LinkedHashSet;

public class LinkedHashSetBasics01 {
    public static void main(String[] args) {
        LinkedHashSet<String> languages = new LinkedHashSet<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Java");

        System.out.println("Languages: " + languages);
        System.out.println("Size: " + languages.size());
    }
}

// Output:
// Languages: [Java, Python, C++]
// Size: 3

// 2. Explanation:

// 1. add() adds an element if it is not already present.
// 2. The second "Java" is ignored.
// 3. The original insertion order is maintained.
// 4. size() returns the number of unique elements.
