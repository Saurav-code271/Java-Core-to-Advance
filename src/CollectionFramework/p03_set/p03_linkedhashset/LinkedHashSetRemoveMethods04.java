package CollectionFramework.p03_set.p03_linkedhashset;


import java.util.LinkedHashSet;

public class LinkedHashSetRemoveMethods04 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers =
                new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original: " + numbers);

        numbers.remove(20);
        System.out.println("After remove: " + numbers);

        numbers.removeIf(n -> n > 35);
        System.out.println("After removeIf: " + numbers);

        numbers.clear();
        System.out.println("After clear: " + numbers);
        System.out.println("Is empty: " + numbers.isEmpty());
    }
}

// Output:

// Original: [10, 20, 30, 40, 50]
// After remove: [10, 30, 40, 50]
// After removeIf: [10, 30]
// After clear: []
// Is empty: true
