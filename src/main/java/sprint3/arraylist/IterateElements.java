package sprint3.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateElements {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Yellow");

        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}