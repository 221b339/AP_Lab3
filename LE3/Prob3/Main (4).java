interface Flyable {
    void fly();
}

interface Quackable {
    void quack();
}


interface Squeakable {
    void squeak();
}

abstract class Duck {
    void swim() {
        System.out.println("All ducks can swim.");
    }
}

public class Main {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck lakeDuck = new LakeDuck();

        System.out.println("\nRubber Duck:");
        rubberDuck.swim();
        ((Squeakable) rubberDuck).squeak();

        System.out.println("\nWooden Duck:");
        woodenDuck.swim();

        System.out.println("\nRedHead Duck:");
        redHeadDuck.swim();
        ((Flyable) redHeadDuck).fly();
        ((Quackable) redHeadDuck).quack();

        System.out.println("\nLake Duck:");
        lakeDuck.swim();
        ((Flyable) lakeDuck).fly();
        ((Quackable) lakeDuck).quack();
    }
}
