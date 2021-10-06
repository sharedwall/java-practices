package sprint3.lindedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArrayList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Mohammad");
        list.add("Ali");
        list.add("Saeed");
        list.add("Hassan");
        System.out.println(list);

        ArrayList<String> newList = new ArrayList<>(list);
        System.out.println(newList.get(2));
    }
}
