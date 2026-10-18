package CollectionFramework.p03_set.p01_set_interface;
// 1. This class covers remove(), removeAll(), retainAll(), and clear().

import java.util.HashSet;
import java.util.Set;

public class SetRemoveMethods02 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original: " + numbers);

        // Remove one element
        numbers.remove(20);
        System.out.println("After remove(20): " + numbers);

        // Remove all elements that occur in another set
        Set<Integer> removeNumbers = new HashSet<>();
        removeNumbers.add(30);
        removeNumbers.add(40);

        numbers.removeAll(removeNumbers);
        System.out.println("After removeAll: " + numbers);

        // Keep only elements that occur in another set
        Set<Integer> keepNumbers = new HashSet<>();
        keepNumbers.add(10);
        keepNumbers.add(50);

        numbers.retainAll(keepNumbers);
        System.out.println("After retainAll: " + numbers);

        // Remove everything
        numbers.clear();
        System.out.println("After clear: " + numbers);
    }
}

// Expected Output:
// Original: [50, 20, 40, 10, 30]
// After remove(20): [50, 40, 10, 30]
// After removeAll: [50, 10]
// After retainAll: [50, 10]
// After clear: []

// 2. The order may vary because this example uses HashSet.

// 3. Understand the difference:

// 1. remove(20) removes one element.
// 2. removeAll(otherSet) removes every element found in the other collection.
// 3. retainAll(otherSet) keeps only elements found in the other collection.
// 4. clear() removes all elements.