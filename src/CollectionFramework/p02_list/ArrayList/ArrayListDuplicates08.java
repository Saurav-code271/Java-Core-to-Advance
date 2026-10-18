package CollectionFramework.p02_list.ArrayList;
// 1. Learn how to find duplicate values using nested loops.
// This beginner version is useful for practicing arrays and list indexes.

import java.util.ArrayList;

public class ArrayListDuplicates08 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        System.out.println("List: " + numbers);
        System.out.println("Duplicate values:");

        for (int i = 0; i < numbers.size(); i++) {
            boolean alreadyReported = false;

            for (int k = 0; k < i; k++) {
                if (numbers.get(k).equals(numbers.get(i))) {
                    alreadyReported = true;
                    break;
                }
            }

            if (alreadyReported) {
                continue;
            }

            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i).equals(numbers.get(j))) {
                    System.out.println(numbers.get(i));
                    break;
                }
            }
        }
    }
}

// 2. Output:
// List: [10, 20, 10, 30, 20]
// Duplicate values:
// 10
// 20

// 3. Points:
// This prints each duplicated value only once, even if it appears more than twice. Its time complexity is \(O(n^2)\),
// making it suitable for learning but not ideal for very large lists.
