package Lab1;
import java.util.*;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehavior = new FlyOnWings();
        quackBehavior = new QuackNoQuack();
    }

    @Override
    public void display() {
        System.out.println("Красноголовая утка");
    }
}


