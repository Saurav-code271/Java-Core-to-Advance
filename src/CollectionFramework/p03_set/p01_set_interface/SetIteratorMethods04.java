package CollectionFramework.p03_set.p01_set_interface;
// 1. The Set interface inherits iteration functionality from Iterable. You can use enhanced for, Iterator, and forEach.

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIteratorMethods04 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Saurav");
        names.add("Rahul");
        names.add("Aman");

        System.out.println("Using enhanced for:");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("Using Iterator:");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Using forEach:");

        names.forEach(System.out::println);
    }
}

// 2. Each approach prints all three names, but the order is not guaranteed for HashSet.

// 3. Important: You cannot use names.get(0) because a Set doesn't provide index-based access.
