

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) throws FigureElementNegative {
        if(radius > 0) this.radius = radius;
        else throw new FigureElementNegative("Circle's radius cannot be a negative number");
    }

    @Override
    public double getArea() {
        return Math.PI * (Math.pow(radius, 2));
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
