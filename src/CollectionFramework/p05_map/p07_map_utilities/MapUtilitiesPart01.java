package CollectionFramework.p05_map.p07_map_utilities;
// 1. This package focuses on practical applications of Map that frequently appear in coding interviews:
// frequency counting, duplicate detection, merging maps, and finding the highest-frequency element.
// 2. Topics: frequency counting, duplicate detection, word frequency, and counting characters.

import java.util.HashMap;
import java.util.Map;

public class MapUtilitiesPart01 {
    public static void main(String[] args) {

        // 1. Count array element frequencies
        int[] numbers = {10, 20, 10, 30, 20, 10, 40};

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int number : numbers) {
            frequency.put(
                    number,
                    frequency.getOrDefault(number, 0) + 1
            );
        }

        System.out.println("Frequencies: " + frequency);

        // 2. Find duplicate elements
        System.out.println("\nDuplicate elements:");

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(
                        entry.getKey() + " appears "
                                + entry.getValue() + " times"
                );
            }
        }

        // 3. Count word frequencies
        String sentence = "java sql java spring sql java";

        HashMap<String, Integer> wordFrequency = new HashMap<>();

        for (String word : sentence.split(" ")) {
            wordFrequency.put(
                    word,
                    wordFrequency.getOrDefault(word, 0) + 1
            );
        }

        System.out.println("\nWord frequencies: " + wordFrequency);

        // 4. Count character frequencies
        String text = "banana";

        HashMap<Character, Integer> characterFrequency = new HashMap<>();

        for (char ch : text.toCharArray()) {
            characterFrequency.put(
                    ch,
                    characterFrequency.getOrDefault(ch, 0) + 1
            );
        }

        System.out.println("\nCharacter frequencies: "
                + characterFrequency);
    }
}

// Output: The order of entries may differ because HashMap doesn't guarantee iteration order.

// Frequencies: {20=2, 40=1, 10=3, 30=1}

//Duplicate elements:
//20 appears 2 times
//10 appears 3 times

//Word frequencies: {spring=1, java=3, sql=2}

//Character frequencies: {a=3, b=1, n=2}

// 3. Understand the key logic -> frequency.put(number, frequency.getOrDefault(number, 0) + 1);
// 4. This single statement does three things:

// 1. getOrDefault(number, 0) retrieves the existing count, or 0 if the number is new.
// 2. +1 increments the count.
// 3. put() stores the updated count.

// 5. For example, when the number 10 appears for the first time, its count becomes 1. On the next occurrence, it becomes 2.

