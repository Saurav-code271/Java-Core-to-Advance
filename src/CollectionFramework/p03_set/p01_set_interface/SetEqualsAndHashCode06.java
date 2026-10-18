package CollectionFramework.p03_set.p01_set_interface;
// 1. Sets compare their elements, not their iteration order. This is important for interviews.

import java.util.HashSet;
import java.util.Set;

public class SetEqualsAndHashCode06 {
    public static void main(String[] args) {
        Set<Integer> first = new HashSet<>();
        first.add(10);
        first.add(20);
        first.add(30);

        Set<Integer> second = new HashSet<>();
        second.add(30);
        second.add(10);
        second.add(20);

        System.out.println("Sets equal: " + first.equals(second));
        System.out.println("First hash: " + first.hashCode());
        System.out.println("Second hash: " + second.hashCode());
    }
}

// Expected Output:

// Sets equal: true
// First hash: 60
// Second hash: 60