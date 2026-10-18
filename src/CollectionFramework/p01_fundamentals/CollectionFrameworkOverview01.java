package CollectionFramework.p01_fundamentals;
// Concept
// The Java Collection Framework is a set of interfaces, implementation classes,
// and utility methods that help you store, organize, and process groups of objects.

// For example, suppose you want to store 100 student names.
// You could create 100 separate variables, but that would be inconvenient.
// An ArrayList lets you store them together and work with them using loops and built-in methods.

import java.util.ArrayList;

public class CollectionFrameworkOverview01 {
    public static void main(String[] args) {
        // Create a collection of student names
        ArrayList<String> students = new ArrayList<>();

        // Add students
        students.add("Saurav");
        students.add("Rahul");
        students.add("Aman");

        // Display all students
        System.out.println("Students: " + students);

        // Display the number of students
        System.out.println("Total students: " + students.size());

        // Access a student using an index
        System.out.println("First student: " + students.get(0));

        // Remove a student
        students.remove("Rahul");

        // Display the updated collection
        System.out.println("After removal: " + students);
    }
}

// Expected output:
// Students: [Saurav, Rahul, Aman]
// Total students: 3
// First student: Saurav
// After removal: [Saurav, Aman]

// @ Understand the important lines.

// 1. ArrayList<String> means a list that stores String objects.
// 2. new ArrayList<>() creates an empty list.
// 3. add() inserts an element.
// 4. size() returns the number of elements currently stored.
// 5. get(0) retrieves the element at index 0.
// 6. remove("Rahul") removes the matching element.

// Notice that the list has no fixed capacity that you need to specify when creating it.
// It can grow as elements are added, subject to available memory and implementation limits.