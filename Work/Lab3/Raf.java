package Lab3;

public class Raf extends Beverage {

    @Override
    public String getDescription() {
        return super.getDescription() + "раф";
    }

    @Override
    public int cost() {
        return super.cost() + 300;
    }
}
