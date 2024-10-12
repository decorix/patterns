package Lab4;

public class BananaFresh extends Beverage {

    private VolumeFactory volume;

    public BananaFresh(VolumeFactory volume) {
        this.volume = volume;
        this.factory = new FreshFactory();
        components();
    }

    @Override
    public String getDescription() {
        return volume.getDescription("банановый фреш");
    }

    @Override
    public double cost() {
        return volume.getCost(330);
    }
}
