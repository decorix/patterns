package Lab4;

public abstract class Beverage {
    private String base = "";
    private String mainIngredient = "";
    private String topper = "";
    protected BeverageFactory factory = null;

    public abstract String getDescription();

    public abstract double cost();

    public void components() {
        base = factory.setBase();
        mainIngredient = factory.setMainIngredient();
        topper = factory.setTopper();
    }
}
