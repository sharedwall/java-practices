package sprint3.arraylist;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class HashSetToArray {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Mohammad");
        hashSet.add("Ali");
        hashSet.add("Mohammad");
        hashSet.add("MohammadReza");
        hashSet.add("Saeed");

        String [] names = new String[hashSet.size()];
        hashSet.toArray(names);
        System.out.println(Arrays.toString(names));

    }
}
