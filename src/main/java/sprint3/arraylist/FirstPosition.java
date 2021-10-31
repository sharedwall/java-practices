package sprint3.arraylist;

import java.util.ArrayList;

public class FirstPosition {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mohammad");
        list.add("Ali");
        list.add(0, "Hassan");
        System.out.println(list);
        int index = list.indexOf("Mohammad");
        list.set(index, "Jalal");
        System.out.println(list);
    }
}
