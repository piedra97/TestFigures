

public class Rectangle implements Shape {
    private double base;
    private double height;

    public Rectangle(double base, double height) {
        if (base <= 0 || height <= 0) throw new IllegalArgumentException("You cannot have any Rectangle's component equal or smaller than zero");
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
