package Lab7;

class TeaOrder extends Order {
    private final BeverageFactory factory;

    public TeaOrder(BeverageFactory factory) {
        this.factory = factory;
    }

    @Override
    protected void prepare() {
        System.out.println("Подготовка чая");
    }

    @Override
    protected void boilWater() {
        System.out.println("Нагрев воды для чая");
    }

    @Override
    protected void addIngredients() {
        System.out.println("Добавление ингредиентов");
    }

    @Override
    protected void pourIntoCup() {
        System.out.println("Наливание чая в чашку");
    }

    @Override
    protected void serve() {
        System.out.println("Подача чая");
    }

    @Override
    protected Beverage createBeverage() {
        return factory.createBeverage(volume);
    }
}