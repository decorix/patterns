package Lab4;

public class Mojito extends Beverage {
    private final VolumeFactory volume;

    public Mojito(VolumeFactory volume) {
        this.volume = volume;
        factory = new CocktailFactory();
        components();
    }

    @Override
    public String getDescription() {
        return volume.getDescription("мохито");
    }

    @Override
    public double cost() {
        return volume.getCost(300);
    }
}
