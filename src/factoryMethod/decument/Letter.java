package factoryMethod.decument;

public class Letter implements Document{


    @Override
    public void print() {
        System.out.println("print letter");
    }
}
