package Lab3;

public class Main {

    public static void main(String[] args) {
        Latte latte = new Latte();
        Milk lateWithMilk = new Milk(latte);
        Whip latteWithMilkAndWhip = new Whip(lateWithMilk);
        System.out.println("Заказ: " + latteWithMilkAndWhip.getDescription());
        System.out.println("Стоимость: " + latteWithMilkAndWhip.cost() + " руб \n");

        Capuccino capuccino = new Capuccino();
        Milk capuccinoWithMilk = new Milk(capuccino);
        Choco capuccinoWithMilkChoco = new Choco(capuccinoWithMilk);
        Soy capuccinoWithMilkChocoSoy = new Soy(capuccinoWithMilkChoco);
        System.out.println("Заказ: " + capuccinoWithMilkChocoSoy.getDescription());
        System.out.println("Стоимость: " + capuccinoWithMilkChocoSoy.cost() + " руб");
    }
}
