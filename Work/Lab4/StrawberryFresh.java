package Lab4;

public class StrawberryFresh extends Beverage {
    private final VolumeFactory volume;

    public StrawberryFresh(VolumeFactory volume) {
        this.volume = volume;
        factory = new FreshFactory();
        components();
    }

    @Override
    public String getDescription() {
        return volume.getDescription("клубничный фреш");
    }

    @Override
    public double cost() {
        return volume.getCost(320);
    }
}
