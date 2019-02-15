

public class Square extends Figure {
    private double side;

    public Square(double side) {
        if (side > 0) this.side = side;
        else try {
            throw new FigureElementNegativeException("Square's side cannot be a negative number");
        } catch (FigureElementNegativeException e) {
            e.printStackTrace();
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
