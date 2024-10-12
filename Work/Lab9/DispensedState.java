package Lab9;

public class DispensedState implements State {
    private GumMachine machine;

    public DispensedState(GumMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Монета вставлена, но приз уже выдан");
    }

    @Override
    public void turnLever() {
        System.out.println("Рычаг уже повернут, приз уже выдан");
    }

    @Override
    public void dispense() {
        System.out.println("Жвачка уже выдана");
    }

    @Override
    public void returnCoin() {
        System.out.println("Нельзя вернуть монету после выдачи приза");
    }
}
