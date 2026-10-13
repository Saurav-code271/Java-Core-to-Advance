
import java.lang.classfile.Interfaces;
import java.util.*;

// public class Main {
  //  public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(15);
//        list.add(12);
//        list.addFirst(10);
//        list.add(0, 9);
//        for (int val: list) {
//            System.out.println(val);
//        }
//        list.remove(0);
//        System.out.println(list);
//
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(123);
//        list1.add(456);

        // Adding Elements

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(0,0);
//        System.out.println(list);
//
//        List<Integer> list1 = List.of(4,5,6,7,8,9);
//        list.addAll(list1);
//        System.out.println(list);

        // Removing String Elements

//        ArrayList<String> list = new ArrayList<>();
//        list.add("Apple");
//        list.add("Banana");
//        list.add("Kiwi");
//        list.add("Orange");
//        list.add("Date");
//
//        list.remove("Apple");
//        System.out.println(list);

        // Removing Integer Elements

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        list.remove(Integer.valueOf(1)); // will convert into wrapper class from index to object.
//        System.out.println(list);

        // Write a program to find largest with ArrayList.

//        ArrayList<Integer> list = new ArrayList<>();
//       list.add(91);
//       list.add(22);
//       list.add(86);
//       list.add(99);
//       list.add(21);
//
//       int max = list.get(0);
//
//       for (int i=0; i<list.size(); i++) {
//           if (list.get(i) > max);
//           max = list.get(i);
//       }
//        System.out.println(max);

        // WAP to count how many times a number occurs.

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(22);
//        list.add(11);
//        list.add(10);
//
//        int num = 10;
//        int count = 0;
//
//        for (int i=0; i< list.size(); i++) {
//            if (num == list.get(i)) count++;
//        }
//        System.out.println(count);

        // write a program to reverse an ArrayList.

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//
//        for (int i=list.size()-1; i>=0; i--) {
//            System.out.println(list.get(i)+ "  ");
//        }

        // WAP to find sum of all elements;

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(30);
//        list.add(20);
//        list.add(20);
//
//        int sum = 0;
//        for (int i=0; i< list.size(); i++) {
//            sum += list.get(i);
//        }
//        System.out.println(sum);

        // Find second-largest element without sorting.

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(23);
//        list.add(33);
//        list.add(45);
//
//        int largest = list.get(0);
//        int Secondlargest = list.get(1);
//
//        for (int i = 1; i < list.size(); i++) {
//            if (largest > Secondlargest && Secondlargest > list.get(i)) {
//                Secondlargest = list.get(i);
//            }
//            System.out.println(Secondlargest);
//        }

//        ArrayList<String> list = new ArrayList<>();
//
//        list.add("Saurav");
//        list.add("Kumar");
//        list.add("Engineer");
//
//        Iterator<String> it = list.iterator();
//        while(it.hasNext()) {
//            String value = it.next();
//            System.out.println(value);
//        }
//

//        Stack<Integer> st = new Stack<>();
//        st.push(10);
//        st.push(20);
//        st.push(30);
//        st.push(40);
//        st.push(50);
//        System.out.println(st);
//        st.pop();
//        System.out.println(st);
//        st.peek();
//        System.out.println();
//        st.search(30);
//        System.out.println(st);

        // Queue
        // 1. program using queue.

//        Queue<Integer> list = new LinkedList<>();
//        list.add(20);
//        list.offer(30);
//        list.add(10);
//        System.out.println(list.element());
//        System.out.println(list);
//        System.out.println(list.peek());
//        System.out.println(list.remove());
//        System.out.println(list);

//    }
// }

// SET INTERFACE.

// 1. In this we are Implementing the HashSet class.

//public class Main {
//    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>(); // HashSet does not maintain insertion order.
//        set.add(10);
//        set.add(20);
//        // set.add(10); // Does not allow duplicate values.
//        set.add(30);
//        set.add(40);
//        System.out.println(set);
//        System.out.println(set.contains(30));
//       // System.out.println(set.remove(20));
//      //  System.out.println(set);
//        System.out.println(set.hashCode());
//
//        Set<Integer> set1 = new HashSet<>();
//        set1.add(20);
//        set1.add(30);
//        set1.add(40);
//        System.out.println("Before retain" + set1);
//        set.retainAll(set1);
//        System.out.println("After retain" + set1);
//        System.out.println(set1.spliterator());
//        set1.retainAll(set);
//        System.out.println(set);
//
//    }
//}

// 2. In this we are implementing LinkedHashSet.

//public class Main {
//    public static void main(String[] args) {
//        Set<Integer> set = new LinkedHashSet<>();
//        // In this I found the same methods as previous one.
//        set.add(10);
//        set.add(20);
//        set.add(30);
//        set.add(40);
//        System.out.println(set);
//    }
//}

// 3. In this we are implementing TreeSet.

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println(set);
    }
}
