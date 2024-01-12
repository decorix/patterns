package Lab3;

public class Whip extends FavoringDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", взбитые сливки";
    }

    @Override
    public int cost() {
        return super.cost() + 30;
    }
}
