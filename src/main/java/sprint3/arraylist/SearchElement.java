package sprint3.arraylist;

import java.util.ArrayList;
import java.util.Comparator;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mohammad");
        list.add("Ali");
        list.add(0, "Hassan");
        System.out.println(list);
        System.out.println(list.contains("Ali"));
        System.out.println(list.contains("Alii"));
        list.sort(Comparator.comparingInt(String::length));
        System.out.println(list);
    }
}
