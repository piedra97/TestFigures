

public class Circle implements Shape{
    private double radius;

    public Circle(double radius)  {
        if(radius <= 0) throw new IllegalArgumentException("Radius can't be zero or smaller");
        this.radius = radius;
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
