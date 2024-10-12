package Lab4;

public class GreenTea extends Beverage {
    private final VolumeFactory volume;

    public GreenTea(VolumeFactory volume) {
        this.volume = volume;
        factory = new TeaFactory();
        components();
    }

    @Override
    public String getDescription() {
        return volume.getDescription("зеленый чай");
    }

    @Override
    public double cost() {
        return volume.getCost(120);
    }
}
