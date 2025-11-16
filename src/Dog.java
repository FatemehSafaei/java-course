public class Dog {

    String name;
    Double b;

    {
        System.out.println("block 1");
        b = 1.0;
        System.out.println("block 2");
        print();
    }

    Dog() {
        System.out.println("block 3");
        print();
    }

    public Dog(String name) {
        this.name = name;
    }

    public void print() {
        while (true) {
            System.out.println("Name: " + name + ", b: " + b);
        }
    }

}

