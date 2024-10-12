package Lab4;

public class Capuccino extends Beverage {
    private final VolumeFactory volume;

    public Capuccino(VolumeFactory volume) {
        this.volume = volume;
        factory = new CoffeeFactory();
        components();
    }

    @Override
    public String getDescription() {
        return volume.getDescription("капучино");
    }

    @Override
    public double cost() {
        return volume.getCost(150);
    }
}
