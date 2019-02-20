

public class Comparator {
    public static double compareArea(Shape shapeA, Shape shapeB) {
       return shapeA.getArea() - shapeB.getArea();
    }

   public  static double comparePerimeter(Shape shapeA, Shape shapeB) {
       return shapeA.getPerimeter() - shapeB.getPerimeter();
    }
}
