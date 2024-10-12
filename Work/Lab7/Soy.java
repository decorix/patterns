package Lab7;

class Soy extends FlavoringDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " с соей объемом " + beverage.volume;
    }

    @Override
    public double cost() {
        return beverage.cost() + 30;
    }
}