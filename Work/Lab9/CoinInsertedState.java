package Lab9;

public class CoinInsertedState implements State {
    private GumMachine machine;

    public CoinInsertedState(GumMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Монета уже вставлена");
    }

    @Override
    public void turnLever() {
        System.out.println("Рычаг повернут");
        machine.setState(machine.getLeverTurnedState());
    }

    @Override
    public void dispense() {
        System.out.println("Рычаг еще не повернут");
    }

    @Override
    public void returnCoin() {
        System.out.println("Монета возвращена");
        machine.setState(machine.getNoCoinState());
    }
}
