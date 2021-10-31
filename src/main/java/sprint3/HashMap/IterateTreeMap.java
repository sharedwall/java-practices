package sprint3.HashMap;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class IterateTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Mohammad", 12);
        map.put("Ali", 13);
        map.put("Hassan", 3);
        map.put("Reza", 8);
        map.put("Green", 22);
        System.out.println(map);

        map.forEach((k,v)-> System.out.println("Key: "+ k + ", Value: " + v));
    }
}
