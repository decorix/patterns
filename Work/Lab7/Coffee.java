package Lab7;

class Coffee extends Beverage {
    public Coffee(double volume) {
        this.description = "Кофе";
        this.volume = volume;
    }

    @Override
    public double cost() {
        if (volume == 0.3) {
            return 80;
        } else if (volume == 0.5) {
            return 100;
        }
        return 0;
    }
}
