package Lab7;

class TeaFactory implements BeverageFactory {
    @Override
    public Beverage createBeverage(double volume) {
        return new Tea(volume);
    }
}
