package CollectionFramework.p03_set.p06_set_operations;
// 1. Union combines all unique elements from both sets.
// 2. In Java, we can use addAll() to perform a union on a separate result set.

import java.util.HashSet;
import java.util.Set;

public class SetUnion01 {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        setA.add(10);
        setA.add(20);
        setA.add(30);
        setA.add(40);

        Set<Integer> setB = new HashSet<>();
        setB.add(30);
        setB.add(40);
        setB.add(50);
        setB.add(60);

        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);

        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);
        System.out.println("Union: " + union);
    }
}

// Output:- the order may vary because HashSet does not guarantee iteration order:

// Set A: [10, 20, 30, 40]
// Set B: [50, 20, 40, 10, 30]
// Union: [50, 20, 40, 10, 60, 30]

// 3. The exact order is not important. The union must contain each of the six distinct values.
// 4. Important: new HashSet<>(setA) creates a copy, so setA remains unchanged when we add elements from setB.
// @5. addAll() adds elements from another collection; a Set automatically prevents duplicates.

