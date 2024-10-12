package Lab7;

class Whip extends FlavoringDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " со взбитыми сливками объемом " + beverage.volume;
    }

    @Override
    public double cost() {
        return beverage.cost() + 40;
    }
}
