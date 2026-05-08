package factoryMethod.decument;

import factoryMethod.shape.ShapeFactory;

public class DocumentFactory {

/*    public static Document createDocument(String title) {
        return switch (title) {
            case "Letter" -> new Letter();
            case "Book" -> new Book();
            default -> null;
        };
    }*/

    public static Document createDocument(String title) {

        if (title.equalsIgnoreCase("Letter")) {
            return new Letter();
        }
        if (title.equalsIgnoreCase("Book")) {
            return new Book();
        }
        return null;
    }
}
