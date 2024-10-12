// В файле CitySalesReportDisplay.java
package Lab10;

public class CitySalesReportDisplay implements Observer {
    private GumMachine gumMachine;

    public CitySalesReportDisplay(GumMachine gumMachine) {
        this.gumMachine = gumMachine;
        this.gumMachine.addObserver(this);
    }

    @Override
    public void update() {
        displayReport();
    }

    public void displayReport() {
        System.out.println("Отчет о продажах для города:");
        System.out.println("Количество затраченных монет: " + gumMachine.getSpentCoins());
        System.out.println("Количество выданных жвачек: " + gumMachine.getIssuedChewingGums());
        System.out.println("Количество выданных призов: " + gumMachine.getIssuedPrizes());
        System.out.println("Остаток жвачек: " + gumMachine.getRemainingChewingGums());
        System.out.println("Остаток призов: " + gumMachine.getRemainingPrizes());
    }
}
