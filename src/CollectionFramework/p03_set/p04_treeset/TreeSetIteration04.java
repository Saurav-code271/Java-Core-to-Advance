package CollectionFramework.p03_set.p04_treeset;
// 1. A TreeSet supports forward iteration, reverse iteration, and forEach().

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetIteration04 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(50);

        // 1. Enhanced for loop
        System.out.print("Enhanced for: ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        // 2. Iterator
        System.out.print("Iterator: ");

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        // 3. Descending iterator
        System.out.print("Descending iterator: ");

        Iterator<Integer> reverse = numbers.descendingIterator();

        while (reverse.hasNext()) {
            System.out.print(reverse.next() + " ");
        }

        System.out.println();

        // 4. forEach with lambda
        System.out.print("forEach: ");

        numbers.forEach(number ->
                System.out.print(number + " "));

        System.out.println();
    }
}

// Expected output:

// Enhanced for: 10 20 30 40 50
// Iterator: 10 20 30 40 50
// Descending iterator: 50 40 30 20 10
// forEach: 10 20 30 40 50

// 2. Interview point: iterator() traverses according to the set's ordering,
// while descendingIterator() traverses in reverse order.
