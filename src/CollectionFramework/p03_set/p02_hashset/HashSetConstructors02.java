package CollectionFramework.p03_set.p02_hashset;
// 1. Java provides several constructors for HashSet. Create this class to understand them.

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class HashSetConstructors02 {
    public static void main(String[] args) {
        // 1. Default constructor
        HashSet<Integer> first = new HashSet<>();
        first.add(10);
        first.add(20);

        // 2. Constructor with initial capacity
        HashSet<Integer> second = new HashSet<>(32);
        second.add(100);
        second.add(200);

        // 3. Constructor with initial capacity and load factor
        HashSet<Integer> third = new HashSet<>(32, 0.75f);
        third.add(1000);
        third.add(2000);

        // 4. Constructor accepting another collection
        Collection<Integer> source = new ArrayList<>();
        source.add(10);
        source.add(10);
        source.add(30);

        HashSet<Integer> fourth = new HashSet<>(source);

        System.out.println("Default: " + first);
        System.out.println("Capacity-based: " + second);
        System.out.println("Capacity and load factor: " + third);
        System.out.println("From collection: " + fourth);
    }
}

// Expected output (order may vary):

// Default: [20, 10]
// Capacity-based: [100, 200]
// Capacity and load factor: [1000, 2000]
// From collection: [10, 30]

// 1. Constructor summary:

//  Constructor	                  Purpose
// 1. HashSet<>()	              Creates an empty set with default settings
// 2. HashSet<>(32)	              Specifies initial capacity
// 3. HashSet<>(32, 0.75f)	      Specifies capacity and load factor
// 4. HashSet<>(collection)	      Copies unique elements from a collection

// 2. The load factor controls how full the internal hash table can become before resizing is triggered. The default is 0.75.
// 3. Note that the initial capacity is not the same as the number of elements the set currently contains.