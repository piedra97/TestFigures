
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class SquareTest {


    @Test(expected = FigureElementNegativeException.class)
    public void havingSquareSideNegativeThrowsAFigureElementNegativeException() {
        //Arrange
        double side = -1.0;
        //Act
        Square square = new Square(side);
        //Assert
        Assertions.fail();
    }
    @Test
    public void calculateAreaWithPositiveSideOk() {
        //Arrange
        double side = 5.0;
        //Act
        Square square = new Square(side);
        double result = square.getArea();
        //Asserts
        Assertions.assertEquals(25.0, result);
    }

    @Test
    public void calculatePerimeterWithPositiveSideOk() {
        //Arrange
        double side = 5.0;
        //Act
        Square square = new Square(side);
        double result = square.getPerimeter();
        //Asserts
        Assertions.assertEquals(20.0, result);
    }
}
