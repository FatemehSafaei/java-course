package session13;

import java.awt.*;

public class ShapeMain {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Recangle square = new Recangle(5,5);

        System.out.println(circle.calculator());
        System.out.println(square.calculator());
    }

    //TODO: 1
    public static void printShapeInfo(AbstractShape shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            IO.println(circle.getRadius());
        } else if (shape instanceof Recangle) {
            Recangle recangle = (Recangle) shape;
            IO.println("Recangle:" + recangle.getWidth() + " x " + recangle.getHeight());
        } else {
            IO.println("Shape type not supported");
        }
    }

    //pattern Matching
    //TODO: 2
    public static double calculateArea(AbstractShape shape) {
        return switch (shape) {
            case Circle circle ->
                    circle.calculator();
            case Recangle recangle ->
                    recangle.calculator();
            case null ->
                    throw new IllegalArgumentException("Shape type not supported");
            default ->
                    throw new IllegalArgumentException("Shape type not supported");
        };

    }
}
