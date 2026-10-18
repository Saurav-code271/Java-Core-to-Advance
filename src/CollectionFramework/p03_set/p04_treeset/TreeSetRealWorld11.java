package CollectionFramework.p03_set.p04_treeset;
// 1. storing unique exam marks in sorted order.

import java.util.TreeSet;

public class TreeSetRealWorld11 {
    public static void main(String[] args) {
        int[] marks = {75, 90, 65, 90, 82, 75, 95};

        TreeSet<Integer> uniqueMarks = new TreeSet<>();

        for (int mark : marks) {
            uniqueMarks.add(mark);
        }

        System.out.println("Unique sorted marks: " + uniqueMarks);
        System.out.println("Lowest mark: " + uniqueMarks.first());
        System.out.println("Highest mark: " + uniqueMarks.last());

        System.out.println("Marks at least 80: "
                + uniqueMarks.tailSet(80));

        System.out.println("Marks below 90: "
                + uniqueMarks.headSet(90));

        // Count marks in the range 75 to 90, inclusive
        System.out.println("Marks from 75 to 90: "
                + uniqueMarks.subSet(75, true, 90, true));
    }
}

// Output:

// Unique sorted marks: [65, 75, 82, 90, 95]
// Lowest mark: 65
// Highest mark: 95
// Marks at least 80: [82, 90, 95]
// Marks below 90: [65, 75, 82]
// Marks from 75 to 90: [75, 82, 90]
