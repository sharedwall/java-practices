package exercise5;

public class Square extends Rectangle {
    public Square(String color) {
        super(color);
    }

    public Square(String color, double width) {
        super(color, width, width);
    }

    public Square(String color, boolean filled, double width) {
        super(color, filled, width, width);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double width) {
        setLength(width);
        setWidth(width);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setWidth(length);
        super.setLength(length);
    }


    @Override
    public String toString() {
        return "Square{" +
                super.toString() +
                "}";
    }
}
