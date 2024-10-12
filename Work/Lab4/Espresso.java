package Lab4;

public class Espresso extends Beverage {
    private final VolumeFactory volume;

    public Espresso(VolumeFactory volume) {
        this.volume = volume;
        factory = new CoffeeFactory();
        components();
    }

    @Override
    public String getDescription() {
        return volume.getDescription("эспрессо");
    }

    @Override
    public double cost() {
        return volume.getCost(200);
    }
}
