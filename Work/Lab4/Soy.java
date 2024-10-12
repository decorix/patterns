package Lab4;

public class Soy extends FavoringDecorator {
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", сироп";
    }

    @Override
    public double cost() {
        return super.cost() + 60;
    }
}
