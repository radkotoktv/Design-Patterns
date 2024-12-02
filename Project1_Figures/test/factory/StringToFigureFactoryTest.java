package factory;

import figure.Circle;
import figure.Rectangle;
import figure.Triangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class StringToFigureFactoryTest {
    @Test
    public void testCreateFromClassCircle() {
        StringToFigureFactory factory = new StringToFigureFactory();
        assertEquals(Circle.class, factory.create("circle 1").getClass());
    }

    @Test
    public void testCreateFromClassRectangle() {
        StringToFigureFactory factory = new StringToFigureFactory();
        assertEquals(Rectangle.class, factory.create("rectangle 5 6").getClass());
    }

    @Test
    public void testCreateFromClassTriangle() {
        StringToFigureFactory factory = new StringToFigureFactory();
        assertEquals(Triangle.class, factory.create("triangle 2 3 4").getClass());
    }

    @Test
    public void testCreateFromCircleLessArguments() {
        StringToFigureFactory factory = new StringToFigureFactory();
        assertThrows(IllegalArgumentException.class, () -> factory.create("circle"));
    }

    @Test
    public void testCreateFromCircleMoreArguments() {
        StringToFigureFactory factory = new StringToFigureFactory();
        assertThrows(IllegalArgumentException.class, () -> factory.create("circle 1 2"));
    }

    @Test
    public void testCreateFromRectangleLessArguments() {
        StringToFigureFactory factory = new StringToFigureFactory();
        assertThrows(IllegalArgumentException.class, () -> factory.create("rectangle"));
    }

    @Test
    public void testCreateFromRectangleMoreArguments() {
        StringToFigureFactory factory = new StringToFigureFactory();
        assertThrows(IllegalArgumentException.class, () -> factory.create("rectangle 5 6 7"));
    }

    @Test
    public void testCreateFromTriangleLessArguments() {
        StringToFigureFactory factory = new StringToFigureFactory();
        assertThrows(IllegalArgumentException.class, () -> factory.create("triangle"));
    }

    @Test
    public void testCreateFromTriangleMoreArguments() {
        StringToFigureFactory factory = new StringToFigureFactory();
        assertThrows(IllegalArgumentException.class, () -> factory.create("triangle 2 3 4 5"));
    }
}
