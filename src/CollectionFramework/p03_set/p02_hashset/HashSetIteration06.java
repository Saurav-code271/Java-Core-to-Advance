package CollectionFramework.p03_set.p02_hashset;
// 1. A HashSet supports enhanced for, Iterator, and forEach() iteration.

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIteration06 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        names.add("Saurav");
        names.add("Rahul");
        names.add("Aman");

        System.out.println("Enhanced for loop:");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("Iterator:");
        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("forEach:");
        names.forEach(name -> System.out.println(name));
    }
}

// 2. Understand these methods:

// 1. iterator() returns an iterator.
// 2. hasNext() checks whether another element exists.
// 3. next() returns the next element.
// 4. forEach() processes each element.


// 3. The order isn't guaranteed, and each of the three approaches prints the same three names.
