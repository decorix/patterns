package Lab7;

class Chocolate extends FlavoringDecorator {
    private Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " с шоколадом объемом " + beverage.volume;
    }

    @Override
    public double cost() {
        return beverage.cost() + 50;
    }
}