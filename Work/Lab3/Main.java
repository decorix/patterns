package Lab3;

public class Main {

    public static void main(String[] args) {
        Latte latte = new Latte();
        Milk lateWithMilk = new Milk(latte);
        Choco latteWithMilkAndChoco = new Choco(lateWithMilk);
        System.out.println("Заказ: " + latteWithMilkAndChoco.getDescription());
        System.out.println("Стоимость: " + latteWithMilkAndChoco.cost() + " руб \n");

        Capuccino capuccino = new Capuccino();
        Milk capuccinoWithMilk = new Milk(capuccino);
        Choco capuccinoWithMilkChoco = new Choco(capuccinoWithMilk);
        Whip capuccinoWithMilkChocoWhip = new Whip(capuccinoWithMilkChoco);
        System.out.println("Заказ: " + capuccinoWithMilkChocoWhip.getDescription());
        System.out.println("Стоимость: " + capuccinoWithMilkChocoWhip.cost() + " руб");
    }
}
