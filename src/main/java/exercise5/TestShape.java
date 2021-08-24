package exercise5;

public class TestShape {
    public static void main(String[] args) {

        Shape redShape = new Circle("red", false, 5.5);
        System.out.println(redShape);
        System.out.println(redShape.getArea());
        System.out.println(redShape.getPerimeter());
        System.out.println(redShape.getColor());
        System.out.println(redShape.isFilled());

        Circle redCircle = (Circle) redShape;
        System.out.println(redCircle);
        System.out.println(redCircle.getArea());
        System.out.println(redCircle.getPerimeter());
        System.out.println(redCircle.getColor());
        System.out.println(redCircle.isFilled());
        System.out.println(redCircle.getRadius());

        Shape blueShape = new Rectangle("blue", false, 1.0, 2.0);
        System.out.println(blueShape);
        System.out.println(blueShape.getArea());
        System.out.println(blueShape.getPerimeter());
        System.out.println(blueShape.getColor());

        Rectangle blueRectangle = (Rectangle) blueShape;
        System.out.println(blueRectangle);
        System.out.println(blueRectangle.getArea());
        System.out.println(blueRectangle.getColor());
        System.out.println(blueRectangle.getLength());

        Shape greenShape = new Square("green", true, 6.6);
        System.out.println(greenShape);
        System.out.println(greenShape.getArea());
        System.out.println(greenShape.getColor());

        Rectangle greenRectangle= (Rectangle) greenShape;
        System.out.println(greenRectangle);
        System.out.println(greenRectangle.getArea());
        System.out.println(greenRectangle.getColor());
        System.out.println(greenRectangle.getLength());

        Square greenSquare = (Square) greenRectangle;
        System.out.println(greenSquare);
        System.out.println(greenSquare.getArea());
        System.out.println(greenSquare.getColor());
        System.out.println(greenSquare.getSide());
        System.out.println(greenSquare.getLength());
    }
}
