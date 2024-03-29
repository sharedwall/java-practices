package sprint1.exercise4;

import java.util.Objects;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(String color) {
        super(color);
    }

    public Cylinder(String color, double radius) {
        super(color, radius);
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cylinder)) return false;
        if (!super.equals(o)) return false;
        Cylinder cylinder = (Cylinder) o;
        return Double.compare(cylinder.getHeight(), getHeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getHeight());
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height + ", color=" + getColor() + ", radius=" + getRadius() +
                '}';
    }
}
