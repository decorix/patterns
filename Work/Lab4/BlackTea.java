package Lab4;

public class BlackTea extends Beverage {
    private final VolumeFactory volume;

    public BlackTea(VolumeFactory volume) {
        this.volume = volume;
        factory = new TeaFactory();
        components();
    }

    @Override
    public String getDescription() {
        return volume.getDescription("черный чай");
    }

    @Override
    public double cost() {
        return volume.getCost(100);
    }
}
