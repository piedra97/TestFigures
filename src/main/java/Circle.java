

public class Circle implements Shape{
    private double radius;

    public Circle(double radius)  {
        if(radius <= 0) throw new IllegalArgumentException("Radius can't be zero or smaller");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * (Math.pow(radius, 2));
        if (area == Double.POSITIVE_INFINITY) throw new ArithmeticException("Double overflow");
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        if(perimeter == Double.POSITIVE_INFINITY) throw new ArithmeticException("Double Overflow");
        return perimeter;
    }
}
