package sprint3.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompratorSort {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mohammad");
        list.add("Ali");
        list.add("Hassan");
        list.add("Hadi");
        list.add("Mahdi");
        list.add("Yasser");

        ArrayList<String> list2 = (ArrayList<String>) list.clone();
        list2.remove("Mahdi");
        System.out.println(list);
        System.out.println(list2);

    }
}
