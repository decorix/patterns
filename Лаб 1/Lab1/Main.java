package Lab1;

public class Main {
    public static void main(String[] args) {
        AlbinoDuck albinoDuck = new AlbinoDuck();
        RedheadDuck redheadDuck = new RedheadDuck();
        SaxonDuck saxonDuck = new SaxonDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();

        saxonDuck.display();
        saxonDuck.performQuack();
        saxonDuck.performFly();
        System.out.println();

        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();
        System.out.println();

        decoyDuck.display();
        decoyDuck.performQuack();
        decoyDuck.performFly();
        decoyDuck.setFlyBehavior(new FlyThrow());
        decoyDuck.performFly();
        System.out.println();

        redheadDuck.display();
        redheadDuck.performQuack();
        redheadDuck.setQuackBehavior(new QuackLong());
        redheadDuck.performQuack();
        redheadDuck.performFly();
        System.out.println();

        albinoDuck.display();
        albinoDuck.performQuack();
        albinoDuck.performFly();
        albinoDuck.setQuackBehavior(new QuackRadio());
        albinoDuck.setFlyBehavior(new FlyRocket());
        albinoDuck.performQuack();
        albinoDuck.performFly();
    }
}