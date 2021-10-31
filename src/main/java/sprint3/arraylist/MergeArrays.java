package sprint3.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeArrays {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mohammad");
        list.add("Ali");
        list.add("Hassan");

        List<String> list2 = new ArrayList<>();
        list2.add("MohammadReza");
        list2.add("MohammadAli");
        list2.add("Yasser");
        System.out.println(list);

        list.addAll(list2);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        List<String> ported = list.subList(list.size()/2, list.size());
        System.out.println(ported);

    }
}
