package CollectionFramework.p03_set.p01_set_interface;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceBasics01 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        System.out.println("Add Saurav: " + names.add("Saurav"));
        System.out.println("Add Rahul: " + names.add("Rahul"));
        System.out.println("Add Saurav again: " + names.add("Saurav"));

        System.out.println("Names: " + names);
        System.out.println("Size: " + names.size());
        System.out.println("Contains Rahul: " + names.contains("Rahul"));
        System.out.println("Contains Aman: " + names.contains("Aman"));
        System.out.println("Is empty: " + names.isEmpty());
    }
}

// Expected Output: the order of names may vary.

// Add Saurav: true
// Add Rahul: true
// Add Saurav again: false
// Names: [Rahul, Saurav]
// Size: 2
// Contains Rahul: true
// Contains Aman: false
// Is empty: false

// 1. Methods covered:

//    Method	                   What it does
// 1. add(element)	              Adds a unique element
// 2. contains(element)           Checks whether an element exists
// 3. size()	                  Returns the number of elements
// 4. isEmpty()	                  Checks whether the set is empty

// 3. The key idea is that Set.add() returns false when an equal element is already present.