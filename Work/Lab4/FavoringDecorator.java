package Lab4;

public class FavoringDecorator extends Beverage {
    private final Beverage beverage;

    public FavoringDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double cost() {
        return beverage.cost();
    }
}
