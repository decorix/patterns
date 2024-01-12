package Lab3;

public class Soy extends FavoringDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", сироп";
    }

    @Override
    public int cost() {
        return super.cost() + 60;
    }
}
