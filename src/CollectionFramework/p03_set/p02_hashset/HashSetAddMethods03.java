package CollectionFramework.p03_set.p02_hashset;
// 1. This class explores the return value of add().

import java.util.HashSet;

public class HashSetAddMethods03 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        boolean first = numbers.add(10);
        boolean second = numbers.add(20);
        boolean third = numbers.add(10);

        System.out.println("First add: " + first);
        System.out.println("Second add: " + second);
        System.out.println("Duplicate add: " + third);

        System.out.println("Numbers: " + numbers);
    }
}

// Output:

// First add: true
// Second add: true
// Duplicate add: false
// Numbers: [20, 10]

// 2. add() returns true if the set changes because the element was added; otherwise, it returns false.
