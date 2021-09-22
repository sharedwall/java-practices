package sprint3.exercise12;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("C#");
        list.add("C++");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Python");
        list2.add("Android");
        list2.add("Delphi");
        list2.add("Pascal");

        System.out.println("Initial state of list" + list);
        System.out.println("Initial state of list2" + list2);

        ListIterator<String> listIterator = list.listIterator();
        Iterator<String> intIterator = list2.iterator();
        for (String s : list2) {
            if (listIterator.hasNext()) listIterator.next();
            listIterator.add(s);
        }

        System.out.println("After merge two list: " + list);

        while (intIterator.hasNext()) {
            intIterator.next();
            if (intIterator.hasNext()) {
                intIterator.next();
                intIterator.remove();
            }
        }

        System.out.println(list2);
        list.removeAll(list2);
        System.out.println(list);
    }
}
