package type;

public enum FigureType {
    CIRCLE("circle"),
    RECTANGLE("rectangle"),
    TRIANGLE("triangle");

    private final String type;

    FigureType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
