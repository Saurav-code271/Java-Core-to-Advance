package CollectionFramework.p02_list.ArrayList;
// 1. Learn natural sorting and reverse sorting.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSorting07 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        Collections.sort(numbers);
        System.out.println("Ascending: " + numbers);

        numbers.sort(Comparator.reverseOrder());
        System.out.println("Descending: " + numbers);
    }
}

// 2. Output:
// Ascending: [10, 20, 30, 40]
// Descending: [40, 30, 20, 10]

// 3. Points:
// For strings, natural ordering is lexicographic. For custom objects such as employees,
// you'll learn Comparator in the later sorting package.
