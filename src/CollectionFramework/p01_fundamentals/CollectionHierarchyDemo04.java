package CollectionFramework.p01_fundamentals;
// Concept: Understand the hierarchy
// This is one of the most important concepts to understand before studying ArrayList, HashSet, Queue, and Map.

//  Iterable (Traversal Support)
//            ^
// Collection (Common element operations)
//            ^
// List (Ordered elements) -> Set (Unique elements) -> Queue (Processing Order)

// Examples of implementations:

// 1. List → ArrayList, LinkedList, Vector, Stack
// 2. Set → HashSet, LinkedHashSet, TreeSet
// 3. Queue → PriorityQueue, ArrayDeque, LinkedList
// 4. Map → HashMap, LinkedHashMap, TreeMap, Hashtable


import java.util.*;

public class CollectionHierarchyDemo04 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        Set<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.add(10);
        uniqueNumbers.add(10);
        uniqueNumbers.add(20);

        Queue<String> tasks = new ArrayDeque<>();
        tasks.offer("Task 1");
        tasks.offer("Task 2");

        Map<Integer, String> students = new HashMap<>();
        students.put(101, "Saurav");
        students.put(102, "Rahul");

        System.out.println("List: " + numbers);
        System.out.println("Set: " + uniqueNumbers);
        System.out.println("Queue: " + tasks);
        System.out.println("Map: " + students);
    }
}

// Expected Output:

// List: [10, 20]
// Set: [20, 10]
// Queue: [Task 1, Task 2]
// Map: {101=Saurav, 102=Rahul}

// The order of HashSet and HashMap output is not guaranteed, so yours may look different.

// The key differences:

// 1. List: Allows duplicates and maintains a defined element order.
// 2. Set: Does not allow duplicate elements according to its equality rules.
// 3. Queue: Supports holding elements for processing, with ordering determined by its implementation.
// 4. Map: Associates keys with values; keys are unique.

// Notice this declaration:
// Map<Integer, String> students = new HashMap<>();
// Here, Integer represents the key type and String represents the value type.
// The student ID is the key, and the student's name is the value.

// @ Does Map extend Collection?
// No. Map belongs to the Collection Framework, but it is a separate interface hierarchy.