package Lab7;

class Tea extends Beverage {
    public Tea(double volume) {
        this.description = "Чай";
        this.volume = volume;
    }

    @Override
    public double cost() {
        if (volume == 0.3) {
            return 50;
        } else if (volume == 0.5) {
            return 70;
        }
        return 0;
    }
}
