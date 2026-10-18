package CollectionFramework.p02_list.ArrayList;
// 1. Learn how to insert and remove elements.

import java.util.ArrayList;

public class ArrayListAddRemove02 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(30);

        // Insert 20 at index 1
        numbers.add(1, 20);
        System.out.println("After insertion: " + numbers);

        // Remove the element at index 1
        numbers.remove(1);
        System.out.println("After index removal: " + numbers);

        // Remove the Integer value 30, not index 30
        numbers.remove(Integer.valueOf(30));
        System.out.println("After value removal: " + numbers);
    }
}

// 2. Output:
// After insertion: [10, 20, 30]
// After index removal: [10, 30]
// After value removal: [10]

// 3. Imp -> For an ArrayList<Integer>, remove(1) removes the element at index 1.
// remove(Integer.valueOf(1)) removes the value 1 if it exists.
