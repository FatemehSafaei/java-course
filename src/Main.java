import sandwich.Sandwich;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");

        Sandwich sandwich = new Sandwich()
                .addBreed("baguette")
                .addSauce("ketchup")
                .addLettuce("Fresh Leaf")
                .addSausage("sausage - meat ")
                .addtomato("tomato")
                .addCheese("Cheesy ")
                .build();

        System.out.println("Bread: " + sandwich.getBread());
        System.out.println("Lettuce: " + sandwich.getLettuce());
        System.out.println("Sausage: " + sandwich.getSausage());
        System.out.println("Cheese: " + sandwich.getCheese());
        System.out.println("Sauce: " + sandwich.getSauce());
        System.out.println("Tomato: " + sandwich.getTotomato());

        System.out.println("//////////////////////////////////");
        System.out.println(sandwich);

        System.out.println("//////////////////////////////////");
        sandwich.print();

//        Dog dog = new Dog("bella");
//        dog.print();
      /*  for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }*/
        IO.println("");
    }
}