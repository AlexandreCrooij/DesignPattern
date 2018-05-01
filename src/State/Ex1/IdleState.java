package State.Ex1;

public class IdleState implements State {
    private CoffeeMachine coffeeMachine;

    public IdleState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Feeding the machine with a coin...");
        coffeeMachine.setState(coffeeMachine.getInsertingCoinState());
    }

    @Override
    public void returnCoin() {
        System.out.println("Cant give Money back if nothing has been inserted...");
    }

    @Override
    public void pushButton() {
        System.out.println("Cant push a button if machine is in idle state...");
    }

    @Override
    public void rightAmountEntered() {
        System.out.println("No right amount entered as no money has been inserted...");
    }

    @Override
    public void removeCup() {
        System.out.println("No cups have been given out...");
    }

    @Override
    public void resetButtonPushed() {
        System.out.println("Cant reset machine if in idle state....");
    }

    @Override
    public void noCupsCoffeJamSenson() {
        System.out.println("Cant tell if amount of cups is good as machine is in idle state...");
    }
}
