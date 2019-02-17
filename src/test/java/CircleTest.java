import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class CircleTest {


    @Test
    public void havingCircleRadiusNegativeThrowsAFigureElementNegativeException() {
        //Arrange
        double radius = -1.0;
        try {
            //Act
            Circle circle = new Circle(radius);
            //Assert
            Assertions.fail("Figure Element Negative Exception not thrown");
        } catch (FigureElementNegativeException ignored) {}
    }


    @Test
    public void calculateAreaWithPositiveRadiusOk() throws FigureElementNegativeException {
        //Arrange
        double radius = 5.0;
        //Act
        Circle circle = new Circle(radius);
        double result = circle.getArea();
        //Asserts
        Assertions.assertEquals(78.53981633974483, result, 0.01);
    }

    @Test
    public void calculatePerimeterWithPositiveRadiusOk() throws FigureElementNegativeException {
        //Arrange
        double radius = 5.0;
        //Act
        Circle circle = new Circle(radius);
        double result = circle.getPerimeter();
        //Asserts
        Assertions.assertEquals(31.41592653589793, result, 0.01);
    }

}
