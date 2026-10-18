package CollectionFramework.p02_list.LinkedList;

import java.util.LinkedList;

public class LinkedListIndexOf03 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Aman");
        names.add("Rahul");
        names.add("Saurav");
        names.add("Rahul");

        System.out.println("Index of Rahul: " + names.indexOf("Rahul"));
        System.out.println("Last index of Rahul: " + names.lastIndexOf("Rahul"));
        System.out.println("Contains Aman: " + names.contains("Aman"));
        System.out.println("Index of Rohan: " + names.indexOf("Rohan"));
    }
}

// 1. Output:
// Index of Rahul: 1
// Last index of Rahul: 3
// Contains Aman: true
// Index of Rohan: -1

// 2. These methods are similar to the corresponding ArrayList methods.
// Searching is generally \(O(n)\) because the list must be traversed.
