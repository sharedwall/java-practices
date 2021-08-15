package exercise_4;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(200);
        cylinder.setColor("Red");
        cylinder.setRadius(12);
        System.out.println(cylinder);

        Cylinder cylinder1 = new Cylinder(18);
        System.out.println("Area: " + cylinder1.getArea());
        cylinder1.setHeight(341);
        System.out.println(cylinder1);
    }
}
