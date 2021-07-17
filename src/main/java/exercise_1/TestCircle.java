package exercise_1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("The circle has radius of " + circle.getRadius() + " and area of " + circle.getArea());
        Circle circle2 = new Circle(2.0);
        System.out.println("The circle has radius of " + circle2.getRadius() + " and area of " + circle2.getArea());
    }
}
