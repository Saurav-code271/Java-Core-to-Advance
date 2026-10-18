package CollectionFramework.p05_map.p07_map_utilities;
// 1. Topics: finding the most frequent element, merging maps, checking common keys, and building a simple inventory counter.

import java.util.HashMap;
import java.util.Map;

public class MapUtilitiesPart02 {
    public static void main(String[] args) {

        // 1. Find the most frequent number
        int[] numbers = {5, 2, 5, 3, 2, 5, 4, 2};

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int number : numbers) {
            frequency.merge(number, 1, Integer::sum);
        }

        int mostFrequentNumber = numbers[0];
        int highestFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > highestFrequency) {
                highestFrequency = entry.getValue();
                mostFrequentNumber = entry.getKey();
            }
        }

        System.out.println("Frequencies: " + frequency);
        System.out.println("Most frequent number: " + mostFrequentNumber);
        System.out.println("Frequency: " + highestFrequency);

        // 2. Merge two sales maps
        HashMap<String, Integer> branchOne = new HashMap<>();
        branchOne.put("Laptop", 5);
        branchOne.put("Mouse", 10);

        HashMap<String, Integer> branchTwo = new HashMap<>();
        branchTwo.put("Laptop", 3);
        branchTwo.put("Keyboard", 7);

        HashMap<String, Integer> totalSales = new HashMap<>(branchOne);

        branchTwo.forEach((product, quantity) ->
                totalSales.merge(product, quantity, Integer::sum));

        System.out.println("\nTotal sales: " + totalSales);

        // 3. Find common keys
        HashMap<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Saurav", 85);
        studentMarks.put("Rahul", 75);
        studentMarks.put("Amit", 90);

        HashMap<String, Integer> attendance = new HashMap<>();
        attendance.put("Saurav", 90);
        attendance.put("Amit", 95);
        attendance.put("Neha", 80);

        System.out.println("\nStudents in both maps:");

        for (String name : studentMarks.keySet()) {
            if (attendance.containsKey(name)) {
                System.out.println(name);
            }
        }

        // 4. Simple inventory counter
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Keyboard", 10);
        inventory.put("Mouse", 15);

        // Sell two keyboards
        inventory.computeIfPresent(
                "Keyboard",
                (product, quantity) -> quantity - 2
        );

        // Add three monitors to inventory
        inventory.merge("Monitor", 3, Integer::sum);

        System.out.println("\nInventory: " + inventory);
    }
}

// Output:

// Frequencies: {2=3, 3=1, 4=1, 5=3}
//Most frequent number: 2
//Frequency: 3

//Total sales: {Mouse=10, Laptop=8, Keyboard=7}

//Students in both maps:
//Saurav
//Amit

//Inventory: {Mouse=15, Keyboard=8, Monitor=3}

// 2. The most frequent number is 2 here because both 2 and 5 appear three times, and the code retains whichever tied maximum it encounters first.
// Since HashMap iteration order is unspecified, a different run may report 5 instead.

// 3. Important methods to remember;

//    Method	            Practical use

// 1. getOrDefault()	    Count frequencies without a separate existence check
// 2. merge()	            Combine counts or aggregate values
// 3. computeIfAbsent()	    Create a value only when a key has no non-null mapping
// 4. computeIfPresent()	Update an existing non-null mapping
// 5. containsKey()	        Check whether a key exists
// 6. entrySet()	        Examine each key-value pair
