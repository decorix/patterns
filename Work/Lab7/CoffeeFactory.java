package Lab7;

class CoffeeFactory implements BeverageFactory {
    @Override
    public Beverage createBeverage(double volume) {
        return new Coffee(volume);
    }
}