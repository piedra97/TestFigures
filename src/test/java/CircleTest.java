import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class CircleTest {


    @Test
    public void havingCircleRadiusNegativeOrEqualToZeroThrowsAnIllegalArgumentException() {
        //Arrange
        double radius = 0.0;
        try {
            //Act
            Circle circle = new Circle(radius);
            //Assert
            Assertions.fail("Radius 0 doesn't throw exception.");
        } catch (IllegalArgumentException ignored) {}
    }


    @Test
    public void calculateAreaWithPositiveRadiusOk() {
        //Arrange
        double radius = 2.0;
        //Act
        Circle circle = new Circle(radius);
        double result = circle.getArea();
        //Asserts
        Assertions.assertEquals(12.566370614359172, result, 0.01);
    }

    @Test
    public void calculatePerimeterWithPositiveRadiusOk() {
        //Arrange
        double radius = 2.0;
        //Act
        Circle circle = new Circle(radius);
        double result = circle.getPerimeter();
        //Asserts
        Assertions.assertEquals(12.566370614359172, result, 0.01);
    }

    @Test
    public void testOverrideArea() {
        //Arrange
        double radius = Double.MAX_VALUE;
        try {
            //Act
            Circle circle = new Circle(radius);
            double result = circle.getArea();
            //Assertions
            Assertions.fail("Radius Maxim double value doesn't throw exception");
        }catch(ArithmeticException ignored) {}
    }

    @Test
    public void testOverridePerimeter() {
        //Arrange
        double radius = Double.MAX_VALUE;
        try {
            //Act
            Circle circle = new Circle(radius);
            double result = circle.getPerimeter();
            //Assertions
            Assertions.fail("Radius Maxim double value doesn't throw exception");
        }catch(ArithmeticException ignored) {}
    }

}
