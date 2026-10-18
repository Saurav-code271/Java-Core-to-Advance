package CollectionFramework.p02_list.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIteration04 {
    public static void main(String[] args) {
        LinkedList<String> subjects = new LinkedList<>();

        subjects.add("Java");
        subjects.add("DBMS");
        subjects.add("Operating Systems");

        Iterator<String> iterator = subjects.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Reverse traversal:");

        Iterator<String> reverse = subjects.descendingIterator();

        while (reverse.hasNext()) {
            System.out.println(reverse.next());
        }
    }
}

// 1. Output:
// Java
// DBMS
// Operating Systems
// Reverse traversal:
// Operating Systems
// DBMS
// Java

// 2. descendingIterator() traverses the list from its end toward its beginning.
