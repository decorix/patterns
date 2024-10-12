package Lab9;

public class Main {
    public static void main(String[] args) {
        GumMachine gumMachine = new GumMachine(5);

        gumMachine.insertCoin();
        gumMachine.turnLever();
        gumMachine.dispense();

        gumMachine.insertCoin();
        gumMachine.dispense();

        System.out.println("Оставшиеся призы: " + gumMachine.getPrizeCount());
    }
}