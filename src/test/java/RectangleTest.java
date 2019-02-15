import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class RectangleTest {


    @Test(expected = FigureElementNegativeException.class)
    public void havingRectangleBaseNegativeThrowsAFigureElementNegativeException() {
        //Arrange
        double base = -1.0;
        double height = 5.0;
        //Act
        Rectangle rectangle = new Rectangle(base, height);
        //Assert
        Assertions.fail();
    }

    @Test(expected = FigureElementNegativeException.class)
    public void havingRectangleHeightNegativeThrowsAFigureElementNegativeException() {
        //Arrange
        double base = 1.0;
        double height = -5.0;
        //Act
        Rectangle rectangle = new Rectangle(base, height);
        //Assert
        Assertions.fail();
    }

    @Test
    public void calculateAreaWithPositiveSideOk() {
        //Arrange
        double base = 1.0;
        double height = 5.0;
        //Act
        Rectangle rectangle = new Rectangle(base, height);
        double result = rectangle.getArea();
        //Asserts
        Assertions.assertEquals(5.0, result);
    }

    @Test
    public void calculatePerimeterWithPositiveSideOk() {
        //Arrange
        double base = 1.0;
        double height = 5.0;
        //Act
        Rectangle rectangle = new Rectangle(base, height);
        double result = rectangle.getPerimeter();
        //Asserts
        Assertions.assertEquals(12.0, result);
    }
}
