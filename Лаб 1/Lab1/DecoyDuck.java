package Lab1;
import java.util.*;

class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new FlyNoFly();
        quackBehavior = new QuackLoud();
    }

    @Override
    public void display() {
        System.out.println("Утка-приманка");
    }
}

