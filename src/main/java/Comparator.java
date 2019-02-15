

public class Comparator {
    public int compareArea(Figure figureOne, Figure figureTwo) {
        if (figureOne.getArea() > figureTwo.getArea()) {
            return 1;
        } else if (figureOne.getArea() < figureTwo.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

   public  int comparePerimeter(Figure figureOne, Figure figureTwo) {
        if (figureOne.getPerimeter() > figureTwo.getPerimeter()) {
            return 1;
        } else if (figureOne.getPerimeter() < figureTwo.getPerimeter()) {
            return -1;
        } else {
            return 0;
        }
    }
}
