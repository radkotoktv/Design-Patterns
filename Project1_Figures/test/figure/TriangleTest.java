package figure;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TriangleTest {
    @Test
    public void testTriangleNegativeSide() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(-1, 1, 1));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(1, -1, 1));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(1, 1, -1));
    }

    @Test
    public void testTrianglePerimeterSmallSides() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(12, triangle.getPerimeter(), 1e-9);
    }

    @Test
    public void testTriangleSideInequality() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(Double.POSITIVE_INFINITY, 2, 3));
    }

    @Test
    public void testTriangleClone() {
        Triangle triangle = new Triangle(3, 4, 5);
        Triangle clone = triangle.clone();
        assertEquals(triangle, clone);
    }
}
