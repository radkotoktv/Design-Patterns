package figure;

public class Circle implements Figure {
    private final double radius;

    public Circle(double radius) {
        try {
            if (radius <= 0) {
                throw new IllegalArgumentException("Radius of a circle must be positive");
            }
        } finally {
            this.radius = radius;
        }
    }

    @Override
    public double getPerimeter() {
        if (Double.isInfinite(radius)) {
            return Double.POSITIVE_INFINITY;
        }
        if (radius >= Double.MAX_VALUE / (2 * Math.PI)) {
            return Double.POSITIVE_INFINITY;
        }
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "circle " + radius;
    }

    @Override
    public Circle clone() {
        return new Circle(radius);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Circle circle = (Circle) obj;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(radius);
    }
}
