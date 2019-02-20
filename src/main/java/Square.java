

public class Square implements Shape{
    private double side;

    public Square(double side) {
        if (side <= 0) throw new IllegalArgumentException("");
        this.side = side;

    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }
}
