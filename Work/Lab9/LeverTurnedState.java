package Lab9;

public class LeverTurnedState implements State {
    private GumMachine machine;

    public LeverTurnedState(GumMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Монета уже вставлена");
    }

    @Override
    public void turnLever() {
        System.out.println("Рычаг уже повернут");
    }

    @Override
    public void dispense() {
        System.out.println("Жвачка выдана");
        machine.setState(machine.getDispensedState());
    }

    @Override
    public void returnCoin() {
        System.out.println("Нельзя вернуть монету после поворота рычага");
    }
}
