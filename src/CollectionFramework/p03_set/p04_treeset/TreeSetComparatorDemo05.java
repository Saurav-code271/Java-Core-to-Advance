package CollectionFramework.p03_set.p04_treeset;
// 1. By default, integers are sorted in ascending order. With a Comparator, you can define a different order.

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparatorDemo05 {
    public static void main(String[] args) {
        // 1. Natural ascending order
        TreeSet<Integer> ascending = new TreeSet<>();

        ascending.add(40);
        ascending.add(10);
        ascending.add(30);
        ascending.add(20);

        System.out.println("Ascending: " + ascending);

        // 2. Reverse order using Comparator
        TreeSet<Integer> descending =
                new TreeSet<>(Comparator.reverseOrder());

        descending.add(40);
        descending.add(10);
        descending.add(30);
        descending.add(20);

        System.out.println("Descending: " + descending);

        // 3. Sort strings by length
        TreeSet<String> byLength =
                new TreeSet<>(Comparator.comparingInt(String::length));

        byLength.add("Java");
        byLength.add("Spring");
        byLength.add("SQL");
        byLength.add("Collections");

        System.out.println("By length: " + byLength);
    }
}

// Expected Output:

// Ascending: [10, 20, 30, 40]
// Descending: [40, 30, 20, 10]
// By length: [SQL, Java, Spring, Collections]

// 2. a TreeSet uses its ordering comparison to determine whether elements are equivalent.
// Since the comparator compares only string lengths, strings with equal lengths are treated as duplicates. For example,
// "Java" and "Code" cannot both be stored in that set.

// 3. To preserve strings with equal lengths, use a tie-breaker:

//    TreeSet<String> byLengthThenName = new TreeSet<>(
//      Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder())
//);
