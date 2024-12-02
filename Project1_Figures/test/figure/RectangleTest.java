package figure;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class RectangleTest {
    @Test
    public void testRectangleNegativeSide() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-1, 1));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(1, -1));
    }

    @Test
    public void testRectanglePerimeterSmallSides() {
        Rectangle rectangle = new Rectangle(5, 7);
        assertEquals(24, rectangle.getPerimeter(), 1e-9);
    }

    @Test
    public void testRectanglePerimeterBigSides() {
        Rectangle rectangle = new Rectangle(Double.MAX_VALUE, Double.MAX_VALUE);
        assertEquals(Double.POSITIVE_INFINITY, rectangle.getPerimeter(), 1e-9);
    }

    @Test
    public void testRectanglePerimeterInfiniteSides() {
        Rectangle rectangle = new Rectangle(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, rectangle.getPerimeter(), 1e-9);
    }

    @Test
    public void testRectangleClone() {
        Rectangle rectangle = new Rectangle(5, 7);
        Rectangle clone = rectangle.clone();
        assertEquals(rectangle, clone);
    }
}
