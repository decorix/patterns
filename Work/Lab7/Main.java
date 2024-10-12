package Lab7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Order order = null;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Выберите напиток: Кофе / Чай: ");
        String beverage = scanner.nextLine().toLowerCase();

        System.out.print("Выберите объем напитка: 0.3 / 0.5: ");
        double volume = Double.parseDouble(scanner.nextLine());

        String additions = "";
        String milk = "";

        if (beverage.equals("кофе")) {
            System.out.print("Выберите добавку к напитку: Молоко / Сироп / Шоколад / Взбитые сливки / Ничего: ");
            additions = scanner.nextLine();
        }

        if (additions.contains("молоко") && beverage.equals("кофе")) {
            System.out.print("Выберите тип молока: Обычное / Миндальное / Соевое: ");
            milk = scanner.nextLine();
        }

        System.out.print("Выберите температуру напитка: Горячий / Холодный: ");
        String hot = scanner.nextLine();

        System.out.print("Выберите дополнительный элемент к напитку: Круассан / Пирожок / Штрудель / Ничего: ");
        String snack = scanner.nextLine();

        System.out.print("Выберите метод оплаты: По карте / Наличными / QR-кодом: ");
        String paymentMethod = scanner.nextLine();

        BeverageFactory factory;
        switch (beverage) {
            case "кофе":
                factory = new CoffeeFactory();
                order = new CoffeeOrder((CoffeeFactory) factory);
                break;
            case "чай":
                factory = new TeaFactory();
                order = new TeaOrder((TeaFactory) factory);
                break;
        }

        if (order != null) {
            order.chooseVolume(volume);
            order.chooseBeverage();
            if (!snack.isEmpty()) order.chooseSnack(snack);

            switch (additions) {
                case "молоко":
                    order.decorateBeverage("milk");
                    order.chooseMilkType(milk.isEmpty() ? "обычное" : milk);
                    break;
                case "соя":
                    order.decorateBeverage("soy");
                    break;
                case "шоколад":
                    order.decorateBeverage("chocolate");
                    break;
                case "взбитые сливки":
                    order.decorateBeverage("whip");
                    break;
                default:
                    order.decorateBeverage("nothing");
                    break;
            }

            order.chooseTemperature(hot);
            order.choosePaymentMethod(paymentMethod);
            order.processOrder();
        }
    }
}