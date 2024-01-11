package Lab1;
import java.util.*;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoFly();
        quackBehavior = new QuackNoQuack();
    }

    @Override
    public void display() {
        System.out.println("Резиновая утка");
    }
}


