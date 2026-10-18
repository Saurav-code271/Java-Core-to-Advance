package CollectionFramework.p05_map.p04_treemap;
// 1. This class covers navigation methods, range views, descending order, and custom sorting.

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapMethodsPart02 {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        for (int key : new int[]{10, 20, 30, 40, 50, 60}) {
            map.put(key, "Value" + key);
        }

        System.out.println("Original map: " + map);

        // 1. Navigation methods
        System.out.println("Lower key than 30: " + map.lowerKey(30));
        System.out.println("Floor key of 30: " + map.floorKey(30));
        System.out.println("Ceiling key of 35: " + map.ceilingKey(35));
        System.out.println("Higher key than 30: " + map.higherKey(30));

        // 2. Navigation entries
        System.out.println("Lower entry than 30: " + map.lowerEntry(30));
        System.out.println("Floor entry of 30: " + map.floorEntry(30));
        System.out.println("Ceiling entry of 35: " + map.ceilingEntry(35));
        System.out.println("Higher entry than 30: " + map.higherEntry(30));

        // 3. Range views
        System.out.println("Head map (< 40): " + map.headMap(40));
        System.out.println("Head map (<= 40): " + map.headMap(40, true));
        System.out.println("Tail map (>= 30): " + map.tailMap(30));
        System.out.println("Sub map [20, 50): " + map.subMap(20, 50));
        System.out.println("Sub map [20, 50]: "
                + map.subMap(20, true, 50, true));

        // 4. Descending order
        NavigableMap<Integer, String> descending = map.descendingMap();
        System.out.println("Descending map: " + descending);
        System.out.println("Descending keys: " + map.descendingKeySet());

        // 5. Poll first and last entries
        System.out.println("Polled first: " + map.pollFirstEntry());
        System.out.println("Polled last: " + map.pollLastEntry());
        System.out.println("After polling: " + map);

        // 6. Custom comparator: descending key order
        TreeMap<Integer, String> reverseMap =
                new TreeMap<>(Comparator.reverseOrder());

        reverseMap.put(10, "Ten");
        reverseMap.put(30, "Thirty");
        reverseMap.put(20, "Twenty");

        System.out.println("Reverse-order map: " + reverseMap);
    }
}

// Output:

// Original map: {10=Value10, 20=Value20, 30=Value30, 40=Value40, 50=Value50, 60=Value60}
// Lower key than 30: 20
// Floor key of 30: 30
// Ceiling key of 35: 40
// Higher key than 30: 40
// Lower entry than 30: 20=Value20
// Floor entry of 30: 30=Value30
// Ceiling entry of 35: 40=Value40
// Higher entry than 30: 40=Value40
// Head map (< 40): {10=Value10, 20=Value20, 30=Value30}
// Head map (<= 40): {10=Value10, 20=Value20, 30=Value30, 40=Value40}
// Tail map (>= 30): {30=Value30, 40=Value40, 50=Value50, 60=Value60}
// Sub map [20, 50): {20=Value20, 30=Value30, 40=Value40}
// Sub map [20, 50]: {20=Value20, 30=Value30, 40=Value40, 50=Value50}
// Descending map: {60=Value60, 50=Value50, 40=Value40, 30=Value30, 20=Value20, 10=Value10}
// Descending keys: [60, 50, 40, 30, 20, 10]
// Polled first: 10=Value10
// Polled last: 60=Value60
// After polling: {20=Value20, 30=Value30, 40=Value40, 50=Value50}
// Reverse-order map: {30=Thirty, 20=Twenty, 10=Ten}

// 2. Understand the navigation methods:

//    Method	           Meaning for key 30

// 1. lowerKey(30)	       Greatest key strictly less than 30
// 2. floorKey(30)	       Greatest key less than or equal to 30
// 3. ceilingKey(35)	   Smallest key greater than or equal to 35
// 4. higherKey(30)	       Smallest key strictly greater than 30
// 5. pollFirstEntry()	   Returns and removes the first entry
// 6. pollLastEntry()	   Returns and removes the last entry

// 3. Important: headMap(), tailMap(), subMap(), and descendingMap() generally return backed views, not independent copies.
// Changes through a view can affect the original map.