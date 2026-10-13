// In this we are implementing Map Interface.

// 1. we are implementing HashMap in this.

import com.sun.security.jgss.GSSUtil;

import java.util.HashMap;
import java.util.LinkedHashMap;

//public class Map {
//    public static void main(String[] args) {
//        java.util.Map<Integer, String> map = new HashMap<>();
//        map.put(101, " Saurav");
//        map.put(102, " Simran");
//        map.put(103, " sita");
//        map.put(104, " rita");
//        map.put(105, " ");
//        map.put(null, " pankaj");
//        map.put(null, " bhai"); // multiple null values allowed.
//
//       // map.put(101, " ram");  // key should be unique, values duplicate allowed.
//        System.out.println(map);
//        System.out.println(map.get(102)); // access object by key value.
//       // System.out.println(map.remove(101));
//       map.replace(101, "suman");
//       System.out.println(map);
//       System.out.println(map.values());
//       System.out.println(map.keySet());
//       System.out.println(map.entrySet());
//       System.out.println(map.hashCode());
//       map.clear(); // will clear the entire map set.
//        // System.out.println(map);
//    }
//}

// 2. we are implementing LinkedHashMap.

public class Map {
    public static void main(String[] args) {
        java.util.Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(101, "Saurav");
        linkedHashMap.put(102, "Suman");
        linkedHashMap.put(103, "ram");
        linkedHashMap.put(104, "rita");
        linkedHashMap.put(105, "raman");

        // In this I found almost there are same methods.

        System.out.println(linkedHashMap);
    }
}

