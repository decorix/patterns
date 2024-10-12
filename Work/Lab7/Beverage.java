package Lab7;

abstract class Beverage {
    protected String description;
    protected double volume;

    public String getDescription() {
        return description != null ? description : "";
    }

    public abstract double cost();
}