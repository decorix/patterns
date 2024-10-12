package Lab4;

public class MediumVolumeFactory extends VolumeFactory {
    @Override
    public String getDescription(String description) {
        return description + " 0.6";
    }

    @Override
    public double getCost(int cost) {
        return cost + cost * 0.6;
    }
}
