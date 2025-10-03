package ge.edu.ug.solid.lsp.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapesTest {
    @Test
    void testShapes() {
        Rectangle rectangle = new Square();
        validateAreaCalculation(rectangle);
    }

    private void validateAreaCalculation(Rectangle rectangle) {
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        Assertions.assertEquals(200, rectangle.area());
    }
}
