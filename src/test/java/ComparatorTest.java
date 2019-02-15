import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class ComparatorTest {
    private Comparator comparator = new Comparator();

    @Test
    public void ifFirstFigureAreaIsGreaterThanSecondOneReturnOne() {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(10, 20);
        int result = comparator.compareArea(circle, rectangle);

        Assertions.assertEquals(1, result);
    }

    @Test
    public void ifFirstFigureAreaIsLowerThanSecondOneReturnNegativeOne() {
        Rectangle rectangle = new Rectangle(10, 20);
        Square square = new Square(40);
        int result = comparator.compareArea(rectangle, square);

        Assertions.assertEquals(-1, result);
    }

    @Test
    public void ifFirstFigurePerimeterIsGreaterThanSecondOneReturnOne() {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(10, 20);
        int result = comparator.comparePerimeter(circle, rectangle);

        Assertions.assertEquals(1, result);
    }

    @Test
    public void ifFirstFigurePerimeterIsLowerThanSecondOneReturnIntegerNegativeOne() {
        Rectangle rectangle = new Rectangle(10, 20);
        Square square = new Square(40);
        int result = comparator.comparePerimeter(rectangle, square);

        Assertions.assertEquals(-1, result);
    }

    @Test
    public void ifFirstFigureAreaIsEqualToSecondOneReturnZero() {
        Rectangle rectangle = new Rectangle(800, 2);
        Square square = new Square(40);
        int result = comparator.compareArea(rectangle, square);

        Assertions.assertEquals(0, result);
    }

    @Test
    public void ifFirstFigurePerimeterIsEqualToSecondOneItShouldReturnIntegerZero() {
        Rectangle rectangle = new Rectangle(40, 40);
        Square square = new Square(40);
        int result = comparator.comparePerimeter(rectangle, square);

        Assertions.assertEquals(0, result);
    }
}
