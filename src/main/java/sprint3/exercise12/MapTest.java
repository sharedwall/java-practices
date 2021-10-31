package sprint3.exercise12;

import sprint3.exercise8.Employee;

import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap<Integer, Employee> staff = new HashMap<>();
        staff.put(1, new Employee("Harry Hacker"));
        staff.put(2, new Employee("Gary Cooper"));
        staff.put(3, new Employee("Amy Lee"));
        staff.put(4, new Employee("Francesca Cruz"));

        System.out.println(staff);

        staff.remove(1);
        staff.put(5, new Employee("Francesca Miller"));

        System.out.println("Value of key=5 is: " + staff.get(3));
        staff.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));
    }
}