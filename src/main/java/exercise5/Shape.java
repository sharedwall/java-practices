package exercise5;

import java.util.Objects;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        color = "Black";
        filled = false;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;
        Shape shape = (Shape) o;
        return isFilled() == shape.isFilled() && getColor().equals(shape.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), isFilled());
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}