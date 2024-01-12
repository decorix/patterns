package Lab1;

public class SaxonDuck extends Duck {
    public SaxonDuck() {
        flyBehavior = new FlyOnWings();
        quackBehavior = new QuackRadio();
    }

    @Override
    public void display() {
        System.out.println("Саксонская утка");
    }
}