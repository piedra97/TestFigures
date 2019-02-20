import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class RectangleTest {


    @Test
    public void havingRectangleBaseNegativeThrowsAFigureElementNegativeException() {
        //Arrange
        double base = -1.0;
        double height = 5.0;
        try {
            //Act
            Rectangle rectangle = new Rectangle(base, height);
            //Assert
            Assertions.fail("Figure Element Negative Exception not thrown");
        } catch (IllegalArgumentException ignored) {}
    }

    @Test
    public void havingRectangleHeightNegativeThrowsAFigureElementNegativeException() {
        //Arrange
        double base = 1.0;
        double height = -5.0;
        try {
            //Act
            Rectangle rectangle = new Rectangle(base, height);
            //Assert
            Assertions.fail("Figure Element Negative Exception not thrown");
        } catch (IllegalArgumentException ignored) {}
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
    public void calculatePerimeterWithPositiveSideOk()  {
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
