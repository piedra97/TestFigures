

public class Rectangle extends Figure {
    private double base;
    private double height;

    public Rectangle(double base, double height) {
        if (base > 0 && height > 0) {
            this.base = base;
            this.height = height;
        }
        else try {
            throw new FigureElementNegativeException("You cannot have a negative base or height in a rectangle");
        } catch (FigureElementNegativeException e) {
            e.printStackTrace();
        }
    }


    @Override
    public double getArea() {
        return base * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (base + height);
    }
}
