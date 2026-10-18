package CollectionFramework.p03_set.p03_linkedhashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetVsLinkedHashSet13 {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedSet = new LinkedHashSet<>();

        int[] values = {30, 10, 20, 10, 40};

        for (int value : values) {
            hashSet.add(value);
            linkedSet.add(value);
        }

        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedSet);
    }
}

// Output:

// HashSet: [ ... ]
// LinkedHashSet: [30, 10, 20, 40]

// 1. The HashSet order is unspecified; the LinkedHashSet order is preserved.
// 2. Points:

// Feature 	                     HashSet	                           LinkedHashSet

// 1. Duplicates	             Not allowed	        -              Not allowed
// 2. Insertion order	         Not guaranteed	                       Preserved
// 3. Sorted order	             Not guaranteed	                       Not sorted
// 4. null	                     One allowed	         -             One allowed
// 5. Typical basic operations	 O(1) average	                       O(1) average
// 6. Memory	                 Generally lower	                   Extra order-maintenance overhead
