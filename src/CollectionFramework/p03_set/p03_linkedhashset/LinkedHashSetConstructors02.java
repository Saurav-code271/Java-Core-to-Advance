package CollectionFramework.p03_set.p03_linkedhashset;
// 1. LinkedHashSet provides four standard constructors.

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

public class LinkedHashSetConstructors02 {
    public static void main(String[] args) {
        // 1. Default constructor
        LinkedHashSet<Integer> first = new LinkedHashSet<>();

        first.add(30);
        first.add(10);

        // 2. Initial capacity
        LinkedHashSet<Integer> second =
                new LinkedHashSet<>(32);

        second.add(50);
        second.add(40);

        // 3. Initial capacity and load factor
        LinkedHashSet<Integer> third = new LinkedHashSet<>(32, 0.75f);

        third.add(70);
        third.add(60);

        // 4. Construct from another collection
        Collection<Integer> source = new ArrayList<>();
        source.add(20);
        source.add(10);
        source.add(20);
        source.add(30);

        LinkedHashSet<Integer> fourth = new LinkedHashSet<>(source);

        System.out.println("Default: " + first);
        System.out.println("Capacity: " + second);
        System.out.println("Capacity/load factor: " + third);
        System.out.println("From collection: " + fourth);
    }
}

// Expected output:

// Default: [30, 10]
// Capacity: [50, 40]
// Capacity/load factor: [70, 60]
// From collection: [20, 10, 30]

// 2. The collection constructor removes duplicates while retaining the first occurrence order.