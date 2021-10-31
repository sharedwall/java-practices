package sprint3.lindedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class AddElement {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Mohammad");
        list.add("Ali");
        System.out.println(list);

        System.out.println(list.get(1));
        System.out.println(list.getFirst());
    }
}
