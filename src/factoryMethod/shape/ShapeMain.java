package factoryMethod.shape;

public class ShapeMain {

    public static void main(String[] args) {

        Shape shape = ShapeFactory.createShape("Rectangle");
        shape.draw();

        Shape shape2 = ShapeFactory.createShape("Circle");
        shape2.draw();
    }
}
