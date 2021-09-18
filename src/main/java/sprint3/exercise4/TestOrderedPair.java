package sprint3.exercise4;

public class TestOrderedPair {
    public static void main(String[] args) {
        OrderedPair<Integer, String> dictionary = new OrderedPair<>(2, "Mohammad Asheri");
        System.out.println(dictionary);
        System.out.println("key is: "+dictionary.getKey());
        System.out.println("value is: "+ dictionary.getValue());

        Pair<String, String>  message = new OrderedPair<>("hello", "world");
        System.out.println(message);
        System.out.println("key is: "+message.getKey());
        System.out.println("value is: "+ message.getValue());
    }
}
