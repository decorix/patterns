package Lab7;

abstract class Order {
    private Beverage beverage = null;
    protected double volume = 0;
    private String temperature = "";
    private String milkType = "";
    private String snack = "";
    private String paymentMethod = "";

    protected abstract void prepare();

    protected abstract void boilWater();

    protected abstract void addIngredients();

    protected abstract void pourIntoCup();

    protected abstract void serve();

    // Методы для обработки заказа
    private void performPayment() {
        System.out.println("Метод оплаты: " + paymentMethod);
    }

    public final void processOrder() {
        if (beverage == null) {
            System.err.println("Сначала выберите напиток");
            return;
        }

        String recipe = "Рецепт на приготовление\n" +
                "Напиток: " + beverage.getDescription() + "\n" +
                "Горячий / Холодный: " + temperature + "\n";

        if (!milkType.isEmpty()) {
            recipe += "Тип молока: " + milkType + "\n";
        }
        if (!snack.isEmpty() && !snack.equals("ничего")) {
            recipe += "Дополнение к заказу: " + snack;
        }

        System.out.println(recipe);

        prepare();
        boilWater();
        addIngredients();
        pourIntoCup();
        serve();
        performPayment();
    }

    // Методы для выбора параметров заказа
    public final void chooseVolume(double volume) {
        this.volume = volume;
    }

    public final void chooseBeverage() {
        this.beverage = createBeverage();
    }

    protected abstract Beverage createBeverage();

    public final void chooseSnack(String snack) {
        this.snack = snack;
    }

    public final void chooseTemperature(String temperature) {
        this.temperature = temperature;
    }

    public final void decorateBeverage(String addition) {
        Beverage decoratedBeverage = this.beverage;

        switch (addition) {
            case "milk":
                decoratedBeverage = new Milk(decoratedBeverage);
                chooseMilkType(milkType.isEmpty() ? "обычное" : milkType);
                break;
            case "soy":
                decoratedBeverage = new Soy(decoratedBeverage);
                break;
            case "chocolate":
                decoratedBeverage = new Chocolate(decoratedBeverage);
                break;
            case "whip":
                decoratedBeverage = new Whip(decoratedBeverage);
                break;
            case "nothing":
                decoratedBeverage = new Nothing(decoratedBeverage);
                break;

        }

        this.beverage = decoratedBeverage;
    }

    public final void chooseMilkType(String type) {
        this.milkType = type;
    }

    public final void choosePaymentMethod(String method) {
        this.paymentMethod = method;
    }
}
