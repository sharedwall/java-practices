package sprint3.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortReverse {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mohammad");
        list.add("Ali");
        list.add("Hassan");
        list.add("Hadi");
        list.add("Mahdi");
        list.add("Yasser");

        list.sort(Collections.reverseOrder());
        System.out.println(list);
    }
}
