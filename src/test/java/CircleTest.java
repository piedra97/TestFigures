import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class CircleTest {


    @Test(expected = FigureElementNegativeException.class)
    public void havingCircleRadiusNegativeThrowsAFigureElementNegativeException() {
        //Arrange
        double radius = -1.0;
        //Act
        Circle circle = new Circle(radius);
        //Assert
        Assertions.fail();
    }
    @Test
    public void calculateAreaWithPositiveRadiusOk() {
        //Arrange
        double radius = 5.0;
        //Act
        Circle circle = new Circle(radius);
        double result = circle.getArea();
        //Asserts
        Assertions.assertEquals(78.53981633974483, result, 0.01);
    }

    @Test
    public void calculatePerimeterWithPositiveRadiusOk() {
        //Arrange
        double radius = 5.0;
        //Act
        Circle circle = new Circle(radius);
        double result = circle.getPerimeter();
        //Asserts
        Assertions.assertEquals(62.83185307179586, result, 0.01);
    }
}
