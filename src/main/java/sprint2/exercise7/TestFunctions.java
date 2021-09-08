package sprint2.exercise7;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class TestFunctions {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        System.out.println("Consumer example:");
        Consumer<Integer> method = System.out::println;
        numbers.forEach(method);

        System.out.println("BiConsumer example:");
        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
        addTwo.accept(1, 2);

        System.out.println("BiConsumer 2 example:");
        biConsumerFunction(1,2,addTwo);

        System.out.println("BiConsumer 3 example:");
        math(1, 1, (x, y) -> System.out.println(x * y));
        math(1, 1, (x, y) -> System.out.println(x - y));
        math(1, 1, (x, y) -> System.out.println(x + y));
        math(1, 1, (x, y) -> System.out.println(x / y));

        Supplier<LocalDateTime> s = LocalDateTime::now;
        LocalDateTime time = s.get();
        System.out.println("\nSupplier example:");
        System.out.println("Current Time is: " + time);

        System.out.println("\nSupplier 2 example:");
        Supplier<List<String>> supplier = ArrayList::new;
        List<String> suppliedList = supplier.get();
        suppliedList.add("Java");
        suppliedList.add("Python");
        System.out.println(suppliedList);

        System.out.println("\nFunction example:");
        Function<String, String> fun = String::toLowerCase;
        System.out.println(fun.apply("Peter"));

        System.out.println("\nBiFunction example:");
        BiFunction<String, String, Integer> biFun = String::compareToIgnoreCase;
        System.out.println(biFun.apply("Peter", "peter"));
        System.out.println(biFun.apply("Peter", "Mohammad"));

        System.out.println("\nPredicate example:");
        Predicate<String> predicate = String::isEmpty;
        System.out.println(predicate.test(""));
        System.out.println(predicate.test("Mohammad"));

        System.out.println("\nBiPredicate example:");
        BiPredicate<String, String> biPredicate = String::equals;
        System.out.println(biPredicate.test("Mohammad", "Ahmad"));
        System.out.println(biPredicate.test("Mohammad","Mohammad"));

        System.out.println("\nIntFunction example:");
        IntFunction<Integer> intFunction = Integer::bitCount;
        System.out.println(intFunction.apply(12));

    }

    static <Integer> void math(Integer a1, Integer a2, BiConsumer<Integer, Integer> c) {
        c.accept(a1, a2);
    }

    static <T> void biConsumerFunction(T a1, T a2, BiConsumer<T, T> c) {
        c.accept(a1, a2);
    }
}
