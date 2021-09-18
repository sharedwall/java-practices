package sprint3.exercise7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestWildCards {

    public static void main(String[] args) {
        Person first = new Person("Mohammad");
        Person second = new Person("Ali");
        Manager [] managers = new Manager[2];
        Pair<Manager> managerPair = new Pair<>(first, second);
        managers[0] = first;
        managers[1] = second;
        minmaxBonus(managers, managerPair);
        System.out.println(Arrays.toString(managers));
    }

    public static void minmaxBonus(Manager[] a, Pair<? super Manager> result)
    {
        if (a.length == 0) return;
        Manager min = a[0];
        Manager max = a[0];
        for (int i = 1; i < a.length; i++)
        {
            if (min.getBonus() > a[i].getBonus()) min = a[i];
            if (max.getBonus() < a[i].getBonus()) max = a[i];
        }
        result.setFirst(min);
        result.setSecond(max);
    }
}
