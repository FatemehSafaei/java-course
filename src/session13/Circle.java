package session13;

public final class Circle extends AbstractShape {

    private final double radius;
    public static final double CIRCLE_PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculator() {
        return CIRCLE_PI * radius * radius;
    }

    @Override
    public double area() {
        return 0;
    }

    public double getRadius() {
        return radius;
    }
}
