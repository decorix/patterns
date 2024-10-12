package Lab4;

public class Choco extends FavoringDecorator {
    public Choco(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", шоколад";
    }

    @Override
    public double cost() {
        return super.cost() + 47;
    }
}
