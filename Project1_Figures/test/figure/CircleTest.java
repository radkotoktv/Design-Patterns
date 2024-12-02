package figure;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CircleTest {
    @Test
    public void testCircleNegativeRadius() {
        assertThrows(IllegalArgumentException.class, () -> new Circle(-1));
    }

    @Test
    public void testCirclePerimeterSmallRadius() {
        Circle circle = new Circle(5);
        assertEquals(31.41592653589793, circle.getPerimeter(), 1e-9);
    }

    @Test
    public void testCirclePerimeterBigRadius() {
        Circle circle = new Circle(Double.MAX_VALUE);
        assertEquals(Double.POSITIVE_INFINITY, circle.getPerimeter(), 1e-9);
    }

    @Test
    public void testCirclePerimeterInfiniteRadius() {
        Circle circle = new Circle(Double.POSITIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, circle.getPerimeter(), 1e-9);
    }

    @Test
    public void testCircleClone() {
        Circle circle = new Circle(5);
        Circle clone = circle.clone();
        assertEquals(circle, clone);
    }
}
