package Lab7;

class Nothing extends FlavoringDecorator {
    private Beverage beverage;

    public Nothing(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " объемом " + beverage.volume;
    }

    @Override
    public double cost() {
        return beverage.cost();
    }
}