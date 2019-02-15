

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        if(radius > 0) this.radius = radius;
        else try {
            throw new FigureElementNegativeException("Circle's radius cannot be a negative number");
        } catch (FigureElementNegativeException e) {
            e.printStackTrace();
        }
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
