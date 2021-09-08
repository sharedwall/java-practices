package sprint1.exercise4;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder redCylinder = new Cylinder("Red");
        redCylinder.setHeight(200);
        redCylinder.setColor("Red");
        redCylinder.setRadius(12);
        System.out.println(redCylinder);

        Cylinder cylinder = new Cylinder("Black",18);
        System.out.println("Area: " + cylinder.getArea());
        cylinder.setHeight(341);
        System.out.println(cylinder);
    }
}
