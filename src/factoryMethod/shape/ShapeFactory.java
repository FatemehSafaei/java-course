package factoryMethod.shape;

public class ShapeFactory {

    public static Shape createShape(String shapeType) {
        switch (shapeType) {
            case "Rectangle":
                return new Rectangle();
            case "Circle":
                return new Circle();
        }
        return null;
    }
}
