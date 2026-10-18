package CollectionFramework.p03_set.p04_treeset;
// @1. This is an important interview comparison.

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetVsHashSet12 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet =
                new HashSet<>(Arrays.asList(40, 10, 30, 20));

        TreeSet<Integer> treeSet =
                new TreeSet<>(Arrays.asList(40, 10, 30, 20));

        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);

        System.out.println("HashSet contains 30: "
                + hashSet.contains(30));

        System.out.println("TreeSet contains 30: "
                + treeSet.contains(30));
    }
}

// The TreeSet output is:

// TreeSet: [10, 20, 30, 40]

// 2. The exact iteration order of a HashSet is not guaranteed.

// 3. Points:

//  Feature	                            HashSet	                        TreeSet

// 1. Duplicates	                    Not allowed	          -         Not allowed
// 2. Ordering	                        No guaranteed order	            Sorted order
// 3. Typical basic-operation cost	    O(1) average	                O(log n)
// 4. Null with normal setup	        One null allowed	            Null not allowed with natural ordering
// 5. Navigation methods	            No	                            Yes
// 6. Best use	                        Fast membership checks	        Sorted, navigable unique elements