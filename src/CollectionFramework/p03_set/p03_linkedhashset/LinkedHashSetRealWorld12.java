package CollectionFramework.p03_set.p03_linkedhashset;
// 1. This example removes duplicates while preserving the order in which they first appeared.

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetRealWorld12 {
    public static void main(String[] args) {
        List<String> visitors = new ArrayList<>();

        visitors.add("Saurav");
        visitors.add("Rahul");
        visitors.add("Saurav");
        visitors.add("Aman");
        visitors.add("Rahul");
        visitors.add("Priya");

        LinkedHashSet<String> uniqueVisitors =
                new LinkedHashSet<>(visitors);

        System.out.println("Original visitors: " + visitors);
        System.out.println("Unique visitors: " + uniqueVisitors);
    }
}

// Output:
// Original visitors: [Saurav, Rahul, Saurav, Aman, Rahul, Priya]
// Unique visitors: [Saurav, Rahul, Aman, Priya]
