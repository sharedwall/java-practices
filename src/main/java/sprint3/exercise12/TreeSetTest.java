package sprint3.exercise12;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Item> items = new TreeSet<>();
        items.add(new Item("Toaster", 1234));
        items.add(new Item("Widget", 4562));
        items.add(new Item("Modem", 9912));
        System.out.println(items);
        TreeSet<Item> sortByDescription = new TreeSet<>(Comparator.comparing(Item::getDescription));
        sortByDescription.addAll(items);
        System.out.println(sortByDescription);
    }
}
