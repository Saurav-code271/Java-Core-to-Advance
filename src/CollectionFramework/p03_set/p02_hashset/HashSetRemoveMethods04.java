package CollectionFramework.p03_set.p02_hashset;

import java.util.HashSet;

public class HashSetRemoveMethods04 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Original: " + numbers);

        System.out.println("Remove 20: " + numbers.remove(20));
        System.out.println("Remove 99: " + numbers.remove(99));

        numbers.removeIf(n -> n > 25);
        System.out.println("After removeIf: " + numbers);

        numbers.clear();
        System.out.println("After clear: " + numbers);
        System.out.println("Empty: " + numbers.isEmpty());
    }
}

// Output Order may vary:

// Original: [40, 20, 10, 30]
// Remove 20: true
// Remove 99: false
// After removeIf: [10]
// After clear: []
// Empty: true

// 1. Here, removeIf(n -> n > 25) removes every element greater than 25.
