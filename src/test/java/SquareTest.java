
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class SquareTest {


    @Test
    public void havingSquareSideNegativeOrEqualToZeroThrowsAnIllegalArgumentException() {
        //Arrange
        double side = 0.0;
        try {
            //Act
            Square square = new Square(side);
            //Assert
            Assertions.fail("Figure Element Negative Exception not thrown");
        } catch (IllegalArgumentException ignored) {}
    }
    @Test
    public void calculateAreaWithPositiveSideOk()  {
        //Arrange
        double side = 5.0;
        //Act
        Square square = new Square(side);
        double result = square.getArea();
        //Asserts
        Assertions.assertEquals(25.0, result);
    }

    @Test
    public void calculatePerimeterWithPositiveSideOk()  {
        //Arrange
        double side = 5.0;
        //Act
        Square square = new Square(side);
        double result = square.getPerimeter();
        //Asserts
        Assertions.assertEquals(20.0, result);
    }
}
