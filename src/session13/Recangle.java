package session13;

public final class Recangle extends AbstractShape {

    private double side;
    private final double width;
    private final double height;

    public Recangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculator() {
        return side * side;
    }

    @Override
    public double area() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
