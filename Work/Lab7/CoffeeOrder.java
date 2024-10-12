package Lab7;

class CoffeeOrder extends Order {
    private final BeverageFactory factory;

    public CoffeeOrder(BeverageFactory factory) {
        this.factory = factory;
    }

    @Override
    protected void prepare() {
        System.out.println("Подготовка кофе");
    }

    @Override
    protected void boilWater() {
        System.out.println("Нагрев воды для кофе");
    }

    @Override
    protected void addIngredients() {
        System.out.println("Добавление ингредиентов");
    }

    @Override
    protected void pourIntoCup() {
        System.out.println("Наливание кофе в чашку");
    }

    @Override
    protected void serve() {
        System.out.println("Подача кофе");
    }

    @Override
    protected Beverage createBeverage() {
        return factory.createBeverage(volume);
    }
}