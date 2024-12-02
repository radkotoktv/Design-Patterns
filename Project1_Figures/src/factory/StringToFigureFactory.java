package factory;

import figure.Circle;
import figure.Figure;
import figure.Rectangle;
import figure.Triangle;

public class StringToFigureFactory {
    public StringToFigureFactory() {}

    public static Figure create(String representation) {
        String[] parts = representation.split(" ");
        Figure figure;
        switch (parts[0]) {
            case "circle": {
                if (parts.length != 2) {
                    throw new IllegalArgumentException("Circle must have exactly one argument");
                }
                figure = new Circle(Double.parseDouble(parts[1]));
                break;
            }
            case "rectangle": {
                if (parts.length != 3) {
                    throw new IllegalArgumentException("Rectangle must have exactly two arguments");
                }
                figure = new Rectangle(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
                break;
            }
            case "triangle": {
                if (parts.length != 4) {
                    throw new IllegalArgumentException("Triangle must have exactly three arguments");
                }
                figure = new Triangle(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]), Double.parseDouble(parts[3]));
                break;
            }
            default: throw new IllegalArgumentException("Unknown figure");
        }
        return figure;
    }
}
