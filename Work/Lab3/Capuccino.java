package Lab3;

public class Capuccino extends Beverage {

    @Override
    public String getDescription() {
        return super.getDescription() + "капучино";
    }

    @Override
    public int cost() {
        return super.cost() + 150;
    }
}
