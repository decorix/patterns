package Lab3;

public class FavoringDecorator extends Beverage {

    private Beverage beverage;

    public FavoringDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public int cost() {
        return beverage.cost();
    }
}
