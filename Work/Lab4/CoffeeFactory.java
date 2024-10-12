package Lab4;

public class CoffeeFactory extends BeverageFactory {
    @Override
    public String setBase() {
        return "вода";
    }

    @Override
    public String setMainIngredient() {
        return "кофе";
    }

    @Override
    public String setTopper() {
        return "cливки";
    }
}
