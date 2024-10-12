package Lab4;

public class CocktailFactory extends BeverageFactory {
    @Override
    public String setBase() {
        return "газировка";
    }

    @Override
    public String setMainIngredient() {
        return "сироп";
    }

    @Override
    public String setTopper() {
        return "лед";
    }
}
