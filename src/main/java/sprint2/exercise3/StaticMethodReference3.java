package sprint2.exercise3;

interface PowCalculator{
    double pow(int a, int b);
}

public class StaticMethodReference3 {
    public static void main(String[] args) {
        PowCalculator calculator = Math::pow;
        System.out.println("Pow of input is: " + calculator.pow(12,2));
    }
}
