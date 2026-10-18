package CollectionFramework.p02_list.ArrayList;
// 1. Learn to access elements using indexes and retrieve the first and last elements.

import java.util.ArrayList;

public class ArrayListAccessElements03 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Index " + i + ": " + fruits.get(i));
        }

        System.out.println("First: " + fruits.get(0));
        System.out.println("Last: " + fruits.get(fruits.size() - 1));
    }
}

// 2. Output:
// Index 0: Apple
// Index 1: Mango
// Index 2: Banana
// Index 3: Orange
// First: Apple
// Last: Orange

// 3. Remember: accessing an invalid index throws IndexOutOfBoundsException. An empty list has no first or last element.
