

public class Rectangle extends Figure {
    private double base;
    private double height;

    Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
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
