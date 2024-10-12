package Lab9;

public class NoCoinState implements State {
    private GumMachine machine;

    public NoCoinState(GumMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Монета вставлена");
        machine.setState(machine.getCoinInsertedState());
    }

    @Override
    public void turnLever() {
        System.out.println("Вставьте монету");
    }

    @Override
    public void dispense() {
        System.out.println("Вставьте монету");
    }

    @Override
    public void returnCoin() {
        System.out.println("Монеты нет для возврата");
    }
}