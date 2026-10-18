package CollectionFramework.p03_set.p02_hashset;
// 1. Use toArray() when you need to convert a set into an array.

import java.util.Arrays;
import java.util.HashSet;

public class HashSetToArray10 {
    public static void main(String[] args) {
        HashSet<String> languages = new HashSet<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        Object[] objects = languages.toArray();
        String[] strings = languages.toArray(new String[0]);

        System.out.println("Object array: " + Arrays.toString(objects));
        System.out.println("String array: " + Arrays.toString(strings));
        System.out.println("Array length: " + strings.length);
    }
}

// 2. The array length will be 3. The element order may vary.

// 1. toArray() returns an Object[].
// 2. toArray(new String[0]) returns a typed String[].
