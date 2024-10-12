package Lab9;

import java.util.Random;

public class GumMachine {
    private State noCoinState;
    private State coinInsertedState;
    private State leverTurnedState;
    private State dispensedState;

    private State currentState;
    private int prizeCount;

    public GumMachine(int initialPrizeCount) {
        noCoinState = new NoCoinState(this);
        coinInsertedState = new CoinInsertedState(this);
        leverTurnedState = new LeverTurnedState(this);
        dispensedState = new DispensedState(this);

        currentState = noCoinState;
        prizeCount = initialPrizeCount;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void turnLever() {
        currentState.turnLever();
    }

    public void dispense() {
        currentState.dispense();
        if (prizeCount > 0) {
            prizeCount--;

            // Дополнительная логика для проверки выдачи 2 призов или игрушки вместо жвачки
            if (new Random().nextInt(100) < 10) {  // 10% шанс на 2 приза
                System.out.println("Выдано 2 приза!");
                prizeCount--;
            } else if (new Random().nextInt(100) < 15) {  // 15% шанс на игрушку вместо жвачки
                System.out.println("Выдана игрушка вместо жвачки!");
                prizeCount--;
            }
        }
        currentState = noCoinState;
    }

    public void returnCoin() {
        currentState.returnCoin();
    }

    public void setState(State state) {
        currentState = state;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getCoinInsertedState() {
        return coinInsertedState;
    }

    public State getLeverTurnedState() {
        return leverTurnedState;
    }

    public State getDispensedState() {
        return dispensedState;
    }

    public int getPrizeCount() {
        return prizeCount;
    }
}