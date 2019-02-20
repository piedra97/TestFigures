import org.junit.jupiter.api.Assertions;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ComparatorTest {

    @Test
    public void ifFirstFigureAreaIsGreaterThanSecondOneReturnNumberGreaterThanZero() {
        //Arrange
        Shape s1 = mock(Shape.class);
        Shape s2 = mock(Shape.class);

        when(s1.getArea()).thenReturn(10.0);
        when(s2.getArea()).thenReturn(1.0);

        //Act
        double value = Comparator.compareArea(s1,s2);
        //Asserts
        Assertions.assertTrue(value > 0);
    }

    @Test
    public void ifFirstFigureAreaIsLowerThanSecondOneReturnNumberNegative() {
        //Arrange
        Shape s1 = mock(Shape.class);
        Shape s2 = mock(Shape.class);

        when(s1.getArea()).thenReturn(1.0);
        when(s2.getArea()).thenReturn(10.0);

        //Act
        double value = Comparator.compareArea(s1,s2);
        //Asserts
        Assertions.assertTrue(value < 0);
    }


    @Test
    public void ifFirstFigureAreaIsEqualToSecondOneReturnZero() {
        //Arrange
        Shape s1 = mock(Shape.class);
        Shape s2 = mock(Shape.class);

        when(s1.getArea()).thenReturn(10.0);
        when(s2.getArea()).thenReturn(10.0);

        //Act
        double value = Comparator.compareArea(s1,s2);
        //Asserts
        Assertions.assertTrue(value == 0);
    }


    @Test
    public void ifFirstFigurePerimeterIsGreaterThanSecondOneReturnNumberGreaterThanZero()  {
        //Arrange
        Shape s1 = mock(Shape.class);
        Shape s2 = mock(Shape.class);

        when(s1.getPerimeter()).thenReturn(10.0);
        when(s2.getPerimeter()).thenReturn(1.0);

        //Act
        double value = Comparator.comparePerimeter(s1,s2);
        //Asserts
        Assertions.assertTrue(value > 0);
    }

    @Test
    public void ifFirstFigurePerimeterIsLowerThanSecondOneReturnNegativeNumber() {
        //Arrange
        Shape s1 = mock(Shape.class);
        Shape s2 = mock(Shape.class);

        when(s1.getPerimeter()).thenReturn(1.0);
        when(s2.getPerimeter()).thenReturn(10.0);

        //Act
        double value = Comparator.comparePerimeter(s1,s2);

        //Asserts
        Assertions.assertTrue(value < 0);
    }


    @Test
    public void ifFirstFigurePerimeterIsEqualToSecondOneReturnNumberZero() {
        //Arrange
        Shape s1 = mock(Shape.class);
        Shape s2 = mock(Shape.class);

        when(s1.getPerimeter()).thenReturn(10.0);
        when(s2.getPerimeter()).thenReturn(10.0);

        //Act
        double value = Comparator.comparePerimeter(s1,s2);
        //Asserts
        Assertions.assertTrue(value == 0);
    }
}
