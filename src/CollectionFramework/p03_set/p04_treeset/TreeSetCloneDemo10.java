package CollectionFramework.p03_set.p04_treeset;
// 1. clone() creates a shallow copy of the set. Adding or removing elements in the clone does not change the original set.

import java.util.TreeSet;

public class TreeSetCloneDemo10 {
    public static void main(String[] args) {
        TreeSet<Integer> original = new TreeSet<>();
        original.add(10);
        original.add(20);
        original.add(30);

        @SuppressWarnings("unchecked")
        TreeSet<Integer> copy =
                (TreeSet<Integer>) original.clone();

        copy.add(40);
        copy.remove(10);

        System.out.println("Original: " + original);
        System.out.println("Clone: " + copy);
    }
}

// Output:

// Original: [10, 20, 30]
// Clone: [20, 30, 40]

// 2. For objects, the copy is shallow: the two sets may still refer to the same object instances.
