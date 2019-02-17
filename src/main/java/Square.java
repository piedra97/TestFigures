

public class Square extends Figure {
    private double side;

    public Square(double side) throws FigureElementNegativeException {
        if (side > 0) this.side = side;
        else {
            throw new FigureElementNegativeException("Square's side cannot be a negative number");
        }
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
