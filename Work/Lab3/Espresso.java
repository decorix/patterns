package Lab3;

public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return super.getDescription() + "эспрессо";
    }

    @Override
    public int cost() {
        return super.cost() + 149;
    }
}
