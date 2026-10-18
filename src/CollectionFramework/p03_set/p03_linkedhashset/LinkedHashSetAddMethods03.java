package CollectionFramework.p03_set.p03_linkedhashset;
// 1. Learn how add() behaves when an element already exists.

import java.util.LinkedHashSet;

public class LinkedHashSetAddMethods03 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        System.out.println(numbers.add(30));
        System.out.println(numbers.add(10));
        System.out.println(numbers.add(20));
        System.out.println(numbers.add(10));

        System.out.println("Final set: " + numbers);

    }
}

// Output:

// true
// true
// true
// false
// Final set: [30, 10, 20]

// 2. Notice that adding 10 again returns false, and its position doesn't change.
