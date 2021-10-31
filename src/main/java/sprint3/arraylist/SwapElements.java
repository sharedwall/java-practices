package sprint3.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapElements {
    public static void main(String[] args) {
        int firstItem = 2;
        int secondItem = 4;
        List<String> list = new ArrayList<>();
        list.add("Mohammad");
        list.add("Ali");
        list.add("Hassan");
        list.add("Hadi");
        list.add("Mahdi");
        list.add("Yasser");

        System.out.println(list);
        String temp = list.get(firstItem);
        list.set(firstItem, list.get(secondItem));
        list.set(secondItem, temp);
        System.out.println(list);

        Collections.swap(list, 1,5);
        System.out.println(list);

    }
}
