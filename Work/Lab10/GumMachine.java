// В файле GumMachine.java
package Lab10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GumMachine {
    private State noCoinState;
    private State coinInsertedState;
    private State leverTurnedState;
    private State dispensedState;
    private State currentState;
    private int prizeCount;

    private int spentCoins;
    private int issuedChewingGums;
    private int issuedPrizes;
    private int remainingChewingGums;
    private int remainingPrizes;

    private List<Observer> observers = new ArrayList<>();

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
        spentCoins++;
        notifyObservers();
    }

    public void turnLever() {
        currentState.turnLever();
        notifyObservers();
    }

    public void dispense() {
        currentState.dispense();
        if (prizeCount > 0) {
            prizeCount--;
            issuedChewingGums++;
            if (new Random().nextInt(100) < 10) {
                System.out.println("Выдано 2 приза!");
                prizeCount--;
                issuedPrizes += 2;
            } else if (new Random().nextInt(100) < 15) {
                System.out.println("Выдана игрушка вместо жвачки!");
                prizeCount--;
                issuedPrizes++;
            }
        }
        currentState = noCoinState;
        notifyObservers();
    }

    public void returnCoin() {
        currentState.returnCoin();
        notifyObservers();
    }

    public void setState(State state) {
        currentState = state;
        notifyObservers();
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

    public int getSpentCoins() {
        return spentCoins;
    }

    public int getIssuedChewingGums() {
        return issuedChewingGums;
    }

    public int getIssuedPrizes() {
        return issuedPrizes;
    }

    public int getRemainingChewingGums() {
        return remainingChewingGums;
    }

    public int getRemainingPrizes() {
        return remainingPrizes;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
