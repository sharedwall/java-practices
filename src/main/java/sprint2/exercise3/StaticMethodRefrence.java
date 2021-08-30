package sprint2.exercise3;

interface Sayable {
    void say();
}

public class StaticMethodRefrence {
    public static void saySomething() {
        System.out.println("Hello, this is static method.");
    }

    public static void main(String[] args) {
        Sayable sayable = StaticMethodRefrence::saySomething;
        sayable.say();
    }
}
