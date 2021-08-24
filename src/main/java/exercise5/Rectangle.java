package exercise5;

import java.util.Objects;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(String color) {
        super(color);
    }

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.getLength(), getLength()) == 0 && Double.compare(rectangle.getWidth(), getWidth()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLength(), getWidth());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
