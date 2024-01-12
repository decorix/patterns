package Lab3;

public class Milk extends FavoringDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", молоко";
    }

    @Override
    public int cost() {
        return super.cost() + 20;
    }
}
