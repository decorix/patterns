package Lab4;

public class TeaFactory extends BeverageFactory {
    @Override
    public String setBase() {
        return "вода";
    }

    @Override
    public String setMainIngredient() {
        return "чай";
    }

    @Override
    public String setTopper() {
        return "лимон";
    }
}
