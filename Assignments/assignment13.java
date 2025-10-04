package Assignments;

import java.util.*;

public class assignment13 {
    public static void main(String[] args) {
        hashmapDemo();
        System.out.println(createHashSet());
        System.out.println(storeEvenNumbers(20));
        System.out.println(countryList("India", "USA", "Japan", "Germany", "Brazil"));
    }

    static void hashmapDemo() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println("HashMap: " + map);
        System.out.println("Contains key 2: " + map.containsKey(2));
        System.out.println("Contains value 'Three': " + map.containsValue("Three"));
        System.out.println("Get key 3: " + map.get(3));
        map.remove(1);
        System.out.println("After removal: " + map);
        System.out.println("KeySet: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("EntrySet: " + map.entrySet());
        map.replace(2, "TWO");
        System.out.println("After replace: " + map);
        map.putIfAbsent(4, "Four");
        System.out.println("After putIfAbsent: " + map);
        map.clear();
        System.out.println("After clear: " + map);
    }

    static Set<Integer> createHashSet() {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= 10; i++)
            set.add(i);
        return set;
    }

    static ArrayList<Integer> storeEvenNumbers(int N) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= N; i += 2)
            list.add(i);
        return list;
    }

    static ArrayList<String> countryList(String c1, String c2, String c3, String c4, String c5) {
        ArrayList<String> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        return list;
    }
}
