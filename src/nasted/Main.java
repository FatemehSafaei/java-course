package nasted;

public class Main {


    static void main() {

        //Anonymous Classes
        Animal dog = new Animal() {
            @Override
            public void eat() {
                System.out.println("Dog eat");
            }

            @Override
            public void sleep() {
                System.out.println("Dog sleep");
            }
        };

        Animal cat = new Animal() {
            @Override
            public void eat() {
                System.out.println("Cat eat");
            }

            @Override
            public void sleep() {
                System.out.println("Cat sleep");
            }
        };

        dog.eat();
        dog.sleep();

        cat.eat();
        cat.sleep();

        System.out.println(TrafficLight.YELLOW);
    }

    public static String enumT(TrafficLight trafficLight) {
       /* if (trafficLight == TrafficLight.RED) {
            return "red";
        }
        if (trafficLight == TrafficLight.YELLOW) {
            return "yellow";
        }
        if (trafficLight == TrafficLight.GREEN) {
            return "green";
        }
        return "unknown";*/
        return switch (trafficLight) {
            case GREEN -> "GREEN";
            case RED -> "RED";
            case YELLOW -> "YELLOW";
        };
    }
}
