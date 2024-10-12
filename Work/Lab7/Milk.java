package Lab7;

class Milk extends FlavoringDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " c молоком объемом " + beverage.volume;
    }

    @Override
    public double cost() {
        return beverage.cost() + 20;
    }
}