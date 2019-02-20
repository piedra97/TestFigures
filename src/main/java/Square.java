

public class Square implements Shape{
    private double side;

    public Square(double side) {
        if (side <= 0) throw new IllegalArgumentException("");
        this.side = side;

    }

    @Override
    public double getArea() {
        double area = Math.pow(side, 2);
        if (area == Double.POSITIVE_INFINITY) throw new ArithmeticException("Double Overflow");
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = side * 4;
        if (perimeter == Double.POSITIVE_INFINITY) throw new ArithmeticException("Double Overflow");
        return perimeter;
    }
}
