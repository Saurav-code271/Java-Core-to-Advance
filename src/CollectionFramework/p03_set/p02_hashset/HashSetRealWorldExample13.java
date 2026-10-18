package CollectionFramework.p03_set.p02_hashset;
// 1. Let's create a practical example that removes duplicate student IDs while keeping the original order of the IDs in a separate output list.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetRealWorldExample13 {
    public static void main(String[] args) {
        List<Integer> studentIds = new ArrayList<>();

        studentIds.add(101);
        studentIds.add(102);
        studentIds.add(101);
        studentIds.add(103);
        studentIds.add(102);
        studentIds.add(104);

        Set<Integer> seen = new HashSet<>();
        List<Integer> uniqueIds = new ArrayList<>();

        for (int id : studentIds) {
            if (seen.add(id)) {
                uniqueIds.add(id);
            }
        }

        System.out.println("Original IDs: " + studentIds);
        System.out.println("Unique IDs: " + uniqueIds);
    }
}

// Output:

// Original IDs: [101, 102, 101, 103, 102, 104]
// Unique IDs: [101, 102, 103, 104]

// 2. Here, the HashSet tracks which IDs have already appeared. The ArrayList preserves their first-seen order in the result.
