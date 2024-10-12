package Lab4;

public class Whip extends FavoringDecorator {
    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", взбитые сливки";
    }

    @Override
    public double cost() {
        return super.cost() + 35;
    }
}
