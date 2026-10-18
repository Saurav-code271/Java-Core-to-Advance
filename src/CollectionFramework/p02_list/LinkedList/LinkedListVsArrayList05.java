package CollectionFramework.p02_list.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListVsArrayList05 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 1; i <= 5; i++) {
            arrayList.add(i * 10);
            linkedList.add(i * 10);
        }

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        arrayList.add(2, 99);
        linkedList.add(2, 99);

        System.out.println("After insertion:");
        System.out.println(arrayList);
        System.out.println(linkedList);

        System.out.println("ArrayList index 2: " + arrayList.get(2));
        System.out.println("LinkedList index 2: " + linkedList.get(2));
    }
}

// 1. Output:
// ArrayList: [10, 20, 30, 40, 50]
// LinkedList: [10, 20, 30, 40, 50]
// After insertion:
// [10, 20, 99, 30, 40, 50]
// [10, 20, 99, 30, 40, 50]
// ArrayList index 2: 99
// LinkedList index 2: 99

// 2. Both lists produce the same result, but their internal structures differ.

//    Operation	                  ArrayList	                           LinkedList
// 1. Access by index	          O(1)	                                O(n)
// 2. Add at end	Amortized     O(1)                                  O(1)
// 3. Insert/remove in middle	  Usually O(n) due to shifting	        O(n) to locate position; \(O(1)\) once the node is reached
// 4. Memory overhead	          Usually lower	                         Higher due to node links

// 3. Prefer ArrayList by default for ordinary list operations.
// Use LinkedList when its deque operations or node-based behavior actually suit the use case.
