package Lab4;

public class SmallVolumeFactory extends VolumeFactory {
    @Override
    public String getDescription(String description) {
        return description + " 0.4";
    }

    @Override
    public double getCost(int cost) {
        return cost + cost * 0.4;
    }
}
