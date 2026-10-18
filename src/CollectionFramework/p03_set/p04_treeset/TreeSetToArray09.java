package CollectionFramework.p03_set.p04_treeset;
// 1. Learn how to convert a TreeSet to an array.

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetToArray09 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers =
                new TreeSet<>(Arrays.asList(40, 10, 30, 20));

        // Returns Object[]
        Object[] array1 = numbers.toArray();
        System.out.println("Object array: "
                + Arrays.toString(array1));

        // Returns a typed Integer[]
        Integer[] array2 = numbers.toArray(new Integer[0]);
        System.out.println("Integer array: "
                + Arrays.toString(array2));

        // Convert to a String[] from a String TreeSet
        TreeSet<String> names =
                new TreeSet<>(Arrays.asList("Ravi", "Aman", "Neha"));

        String[] array3 = names.toArray(new String[0]);
        System.out.println("Names array: "
                + Arrays.toString(array3));
    }
}

// Output:

// Object array: [10, 20, 30, 40]
// Integer array: [10, 20, 30, 40]
// Names array: [Aman, Neha, Ravi]
