

public class Comparator {
    public int compareArea(Shape figureA, Shape figureB) {
        if (figureA.getArea() > figureB.getArea()) {
            return 1;
        } else if (figureA.getArea() < figureB.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

   public  int comparePerimeter(Shape figureA, Shape figureB) {
        if (figureA.getPerimeter() > figureB.getPerimeter()) {
            return 1;
        } else if (figureA.getPerimeter() < figureB.getPerimeter()) {
            return -1;
        } else {
            return 0;
        }
    }
}
