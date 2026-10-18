package CollectionFramework.p03_set.p01_set_interface;
// 1. A set can be converted into an array using toArray().

import java.util.HashSet;
import java.util.Set;

public class SetArrayConversion05 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Saurav");
        names.add("Rahul");
        names.add("Aman");

        // Convert to Object array
        Object[] objects = names.toArray();

        System.out.println("Object array:");

        for (Object name : objects) {
            System.out.println(name);
        }

        // Convert to a typed String array
        String[] strings = names.toArray(new String[0]);

        System.out.println("String array size: " + strings.length);
    }
}

// 2. The order of the names can vary, but the array size will be 3.
