package factoryMethod.decument;

public class Book implements Document{

    @Override
    public void print() {
        System.out.println("print book");
    }
}
