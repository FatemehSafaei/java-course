package factoryMethod.decument;

public class DocumentMain {

    public static void main(String[] args) {
        Document document = DocumentFactory.createDocument("letter");
        document.print();
    }
}
