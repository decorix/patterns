package Lab4;

public class Main {
    public static void main(String[] args) {
        VolumeFactory smallVolumeFactory = new SmallVolumeFactory();
        VolumeFactory mediumVolumeFactory = new MediumVolumeFactory();
        VolumeFactory largeVolumeFactory = new LargeVolumeFactory();

        Beverage beverage1 = new Espresso(smallVolumeFactory);
        beverage1 = new Milk(beverage1);
        beverage1 = new Choco(beverage1);
        System.out.println("Заказ: " + beverage1.getDescription());
        System.out.println("Стоимость: " + beverage1.cost() + " руб \n");

        Beverage beverage2 = new BananaFresh(mediumVolumeFactory);
        beverage2 = new Soy(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println("Заказ: " + beverage2.getDescription());
        System.out.println("Стоимость: " + beverage2.cost() + " руб \n");

        Beverage beverage3 = new Mojito(largeVolumeFactory);
        beverage3 = new Soy(beverage3);
        beverage3 = new Whip(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println("Заказ: " + beverage3.getDescription());
        System.out.println("Стоимость: " + beverage3.cost() + " руб \n");
    }
}
