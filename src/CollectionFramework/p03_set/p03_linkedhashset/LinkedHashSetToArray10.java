package CollectionFramework.p03_set.p03_linkedhashset;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSetToArray10 {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();

        names.add("Saurav");
        names.add("Rahul");
        names.add("Aman");

        Object[] array1 = names.toArray();
        String[] array2 = names.toArray(new String[0]);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}

// Output:

// [Saurav, Rahul, Aman]
// [Saurav, Rahul, Aman]

// 1. The array conversion preserves the set's iteration order.
