package sprint3.HashMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortMapByValue {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Mohammad", 12);
        map.put("Ali", 13);
        map.put("Hassan", 3);
        map.put("Reza", 8);
        map.put("Green", 22);
        System.out.println(map);
    }
}
