package Lab10;

public class Main {
    public static void main(String[] args) {
        GumMachine gumMachine = new GumMachine(3);

        CitySalesReportDisplay city1 = new CitySalesReportDisplay(gumMachine);
        CitySalesReportDisplay city2 = new CitySalesReportDisplay(gumMachine);
        CitySalesReportDisplay city3 = new CitySalesReportDisplay(gumMachine);

        gumMachine.insertCoin();
        gumMachine.turnLever();
        gumMachine.dispense();
        gumMachine.insertCoin();
        gumMachine.dispense();

        System.out.println("Оставшиеся призы: " + gumMachine.getPrizeCount());
    }
}