package sprint3.exercise6;

public class TestWildCards {

    public static void main(String[] args) {
        Person first = new Person("Mohammad");
        Person second = new Person("Ali");
        Pair<Person> managerPair = new Pair<>(first, second);
        printBuddies(managerPair);
        Pair<? extends Employee> employeePair = managerPair;
        printBuddies(employeePair);
        Employee employee = employeePair.getFirst();
        System.out.println(employee.toString());
    }

    public static void printBuddies(Pair<? extends Employee> p)
    {
        Employee first = p.getFirst();
        Employee second = p.getSecond();
        System.out.println(first.getName() + " and " + second.getName() + " are buddies");
    }
}
