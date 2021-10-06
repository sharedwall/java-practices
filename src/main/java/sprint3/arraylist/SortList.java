package sprint3.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mohammad");
        list.add("Ali");
        list.add("Hassan");
        list.add("Hadi");
        list.add("Mahdi");
        list.add("Yasser");

        list.sort(Comparator.comparingInt(String::length));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
