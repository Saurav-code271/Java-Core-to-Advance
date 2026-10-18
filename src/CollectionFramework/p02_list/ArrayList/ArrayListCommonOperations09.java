package CollectionFramework.p02_list.ArrayList;
// 1. Combine common operations in one revision class.

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCommonOperations09 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        Collections.addAll(numbers, 10, 20, 30, 40, 50);

        int sum = 0;
        int max = numbers.get(0);
        int min = numbers.get(0);

        for (int number : numbers) {
            sum += number;
            max = Math.max(max, number);
            min = Math.min(min, number);
        }

        System.out.println("List: " + numbers);
        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        numbers.removeIf(number -> number % 20 == 0);
        System.out.println("After removing multiples of 20: " + numbers);

        numbers.clear();
        System.out.println("After clear: " + numbers);
        System.out.println("Empty: " + numbers.isEmpty());
    }
}

// 2. Output:
// List: [10, 20, 30, 40, 50]
// Sum: 150
// Maximum: 50
// Minimum: 10
// After removing multiples of 20: [10, 30, 50]
// After clear: []
// Empty: true

// 3. Points:
// The removeIf() method removes every element that matches the given condition. Here, it removes 20 and 40.