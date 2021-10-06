package sprint3.lindedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class PrintList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Mohammad");
        list.add("Ali");
        list.add("Hassan");

        for (String s : list) {
            System.out.println(s);
        }

        list.remove(1);
        System.out.println(list);
    }
}
