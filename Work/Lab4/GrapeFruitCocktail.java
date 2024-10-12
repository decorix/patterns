package Lab4;

public class GrapeFruitCocktail extends Beverage {
    private final VolumeFactory volume;

    public GrapeFruitCocktail(VolumeFactory volume) {
        this.volume = volume;
        factory = new CocktailFactory();
        components();
    }

    @Override
    public String getDescription() {
        return volume.getDescription("грейпрутовый коктель");
    }

    @Override
    public double cost() {
        return volume.getCost(350);
    }
}
