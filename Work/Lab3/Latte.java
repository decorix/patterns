package Lab3;

public class Latte extends Beverage {

    @Override
    public String getDescription() {
        return super.getDescription() + "латте";
    }

    @Override
    public int cost() {
        return super.cost() + 250;
    }
}
