package CollectionFramework.p03_set.p02_hashset;

import java.util.HashSet;

public class HashSetBasics01 {
    public static void main(String[] args) {
        HashSet<String> languages = new HashSet<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Java");

        System.out.println("Languages: " + languages);
        System.out.println("Size: " + languages.size());
    }
}


// Expected Output: Order may vary:
// Languages: [Java, C++, Python]
// Size: 3

// 1. Understand the code:

// 1. HashSet<String> stores unique strings.
// 2. new HashSet<>() creates an empty set.
// 3. add() inserts an element if an equal element isn't already present.
// 4. The second "Java" is ignored.
// 5. size() returns 3, not 4.

// 2. Important: HashSet does not guarantee insertion order or sorted order.


