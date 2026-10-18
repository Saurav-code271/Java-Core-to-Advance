package CollectionFramework.p02_list.ArrayList;
// 1. Use contains(), indexOf(), and lastIndexOf().

import java.util.ArrayList;

public class ArrayListSearch05 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);

        System.out.println(numbers.contains(30));
        System.out.println(numbers.indexOf(20));
        System.out.println(numbers.lastIndexOf(20));
        System.out.println(numbers.indexOf(99));
    }
}

// 2. Output:

// true
// 1
// 3
// -1

// 3. Points:

// 1. contains() returns true if an equal element exists.
// 2. indexOf() returns the first matching index.
// 3. lastIndexOf() returns the last matching index.
// 4. Both index methods return -1 when the element is absent.
