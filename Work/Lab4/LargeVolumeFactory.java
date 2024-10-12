package Lab4;

public class LargeVolumeFactory extends VolumeFactory {
    @Override
    public String getDescription(String description) {
        return description + " 0.8";
    }

    @Override
    public double getCost(int cost) {
        return cost + cost * 0.8;
    }
}
