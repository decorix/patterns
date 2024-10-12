package Lab4;

public class Milk extends FavoringDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", молоко";
    }

    @Override
    public double cost() {
        return super.cost() + 20;
    }
}
