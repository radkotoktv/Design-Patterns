package figure;

public class Triangle implements Figure {
    private final double a, b, c;

    public Triangle(double a, double b, double c) {
        try {
            if (a <= 0 || b <= 0 || c <= 0) {
                throw new IllegalArgumentException("Sides of a triangle must be positive");
            }
            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new IllegalArgumentException("Triangle inequality is violated");
            }
        } finally {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    @Override
    public double getPerimeter() {
        if (Double.isInfinite(a) || Double.isInfinite(b) || Double.isInfinite(c)) {
            return Double.POSITIVE_INFINITY;
        }
        if (a > Double.MAX_VALUE - b - c || b > Double.MAX_VALUE - a - c || c > Double.MAX_VALUE - a - b) {
            return Double.POSITIVE_INFINITY;
        }
        return a + b + c;
    }

    @Override
    public String toString() {
        return "triangle " + a + " " + b + " " + c;
    }

    @Override
    public Triangle clone() {
        return new Triangle(a, b, c);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Triangle triangle = (Triangle) obj;
        return a == triangle.a && b == triangle.b && c == triangle.c;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(a) + Double.hashCode(b) + Double.hashCode(c);
    }
}
