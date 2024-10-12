package Lab4;

public class FreshFactory extends BeverageFactory {
    @Override
    public String setBase() {
        return "сок";
    }

    @Override
    public String setMainIngredient() {
        return "фрукты";
    }

    @Override
    public String setTopper() {
        return "лед";
    }
}
