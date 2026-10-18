package CollectionFramework.p02_list.ArrayList;
// 1. Learn three common ways to traverse a list.

import java.util.ArrayList;

public class ArrayListIteration06 {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        System.out.println("Using for loop:");
        for (int i = 0; i < languages.size(); i++) {
            System.out.println(languages.get(i));
        }

        System.out.println("Using enhanced for loop:");
        for (String language : languages) {
            System.out.println(language);
        }

        System.out.println("Using forEach:");
        languages.forEach(System.out::println);
    }
}

// 2. Output:
// Java
// Python
// C++

// 3. Points:
// Use an indexed loop when you need the index, an enhanced for loop for straightforward traversal, and forEach() for concise processing.
