import org.junit.Test;

public class CircleTest {

    public void havingCircleRadiusNegativeThrowsaFigureElementNegative() {
        double radius = -1;
        Circle circle = new Circle(radius);
    }
}
