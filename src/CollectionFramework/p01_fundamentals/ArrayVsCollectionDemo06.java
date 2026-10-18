package CollectionFramework.p01_fundamentals;
// Concept: Why do we need collections when arrays already exist?
// Arrays are useful when you want a fixed-size structure. Collections provide more flexible operations and,
// for many implementations, can grow or shrink as elements are added or removed.

import java.util.ArrayList;

public class ArrayVsCollectionDemo06 {
    public static void main(String[] args) {
        // Array example
        int[] arr = new int[3];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        System.out.println("Array elements:");

        for (int number : arr) {
            System.out.println(number);
        }

        // Collection example
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Collection elements: " + numbers);

        numbers.remove(Integer.valueOf(20));

        System.out.println("After removal: " + numbers);

        numbers.add(50);

        System.out.println("After adding: " + numbers);
    }
}

// Expected Output:

//Array elements:
//  10
//  20
//  30
// Collection elements: [10, 20, 30, 40]
// After removal: [10, 30, 40]
// After adding: [10, 30, 40, 50]

// Compare them:

// Feature	               Array	                           ArrayList

// 1. Size	              Fixed after creation      	       Grows and shrinks automatically
// 2. Access by index	  Yes               _                  Yes
// 3. Add/remove elements No built-in resizing operations      Built-in methods
// 4. Stores primitives directly	Yes	                       No; uses wrapper types such as Integer
// 5. Built-in sorting	  Uses Arrays.sort()	                Uses Collections.sort() or list.sort()

// Imp -> Java arrays are objects, but they are not implementations of the Collection interface. Also,
// ArrayList<Integer> uses autoboxing to convert between int and Integer.
