package figure;

public class Rectangle implements Figure {
    private final double a, b;

    public Rectangle(double a, double b) {
        try {
            if (a <= 0 || b <= 0) {
                throw new IllegalArgumentException("Sides of a rectangle must be positive");
            }
        } finally {
            this.a = a;
            this.b = b;
        }
    }

    @Override
    public double getPerimeter() {
        if (Double.isInfinite(a) || Double.isInfinite(b)) {
            return Double.POSITIVE_INFINITY;
        }
        if (a > Double.MAX_VALUE / 2 - b || b > Double.MAX_VALUE / 2 - a) {
            return Double.POSITIVE_INFINITY;
        }
        return 2 * (a + b);
    }

    @Override
    public String toString() {
        return "rectangle " + a + " " + b;
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(a, b);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        return a == rectangle.a && b == rectangle.b;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(a) + Double.hashCode(b);
    }
}
