package sprint2.exercise4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestConstructorReferences {

    public static void main(String[] args) {
        String [] namesArray = {"Ali", "Mohammad", "Mehdi", "Saeed"};
        List<String> names = Arrays.asList(namesArray);
        Stream<Person> stream = names.stream().map(Person::new);
        List<Person> people = stream.collect(Collectors.toList());
        System.out.println(people);
    }
}
