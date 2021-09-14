package sprint3.exercise1;

public class TestAssertions {
    public static void main(String[] args) {
        int age = 14;
        assert age <= 18 : "Cannot Vote";
        System.out.println("The voter's age is " + age);
    }
}
