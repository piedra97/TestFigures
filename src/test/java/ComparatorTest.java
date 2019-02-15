import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class ComparatorTest {
    private Comparator comparator = new Comparator();

    @Test
    public void ifFirstFigureAreaIsGreaterThanSecondOneReturnOne() {
        //Arrange
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(10, 20);
        //Act
        int result = comparator.compareArea(circle, rectangle);
        //Asserts
        Assertions.assertEquals(1, result);
    }

    @Test
    public void ifFirstFigureAreaIsLowerThanSecondOneReturnNegativeOne() {
        //Arrange
        Rectangle rectangle = new Rectangle(10, 20);
        Square square = new Square(40);
        //Act
        int result = comparator.compareArea(rectangle, square);
        //Asserts
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void ifFirstFigurePerimeterIsGreaterThanSecondOneReturnOne() {
        //Arrange
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(10, 20);
        //Act
        int result = comparator.comparePerimeter(circle, rectangle);
        //Asserts
        Assertions.assertEquals(1, result);
    }

    @Test
    public void ifFirstFigurePerimeterIsLowerThanSecondOneReturnIntegerNegativeOne() {
        //Arrange
        Rectangle rectangle = new Rectangle(10, 20);
        Square square = new Square(40);
        //Act
        int result = comparator.comparePerimeter(rectangle, square);
        //Asserts
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void ifFirstFigureAreaIsEqualToSecondOneReturnZero() {
        //Arrange
        Rectangle rectangle = new Rectangle(800, 2);
        Square square = new Square(40);
        //Act
        int result = comparator.compareArea(rectangle, square);
        //Asserts
        Assertions.assertEquals(0, result);
    }

    @Test
    public void ifFirstFigurePerimeterIsEqualToSecondOneItShouldReturnIntegerZero() {
        //Arrange
        Rectangle rectangle = new Rectangle(40, 40);
        Square square = new Square(40);
        //Act
        int result = comparator.comparePerimeter(rectangle, square);
        //Asserts
        Assertions.assertEquals(0, result);
    }
}
