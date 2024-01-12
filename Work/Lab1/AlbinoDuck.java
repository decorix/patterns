package Lab1;
import java.util.*;

class AlbinoDuck extends Duck {
    public AlbinoDuck() {
        flyBehavior = new FlyOnWings();
        quackBehavior = new QuackLoud();
    }

    @Override
    public void display() {
        System.out.println("Утка альбинос");
    }
}

