

public class Rectangle implements Shape {
    private double base;
    private double height;

    public Rectangle(double base, double height) {
        if (base > 0 && height > 0) {
            this.base = base;
            this.height = height;
        }
        else {
            //("You cannot have a negative base or height in a rectangle");
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
