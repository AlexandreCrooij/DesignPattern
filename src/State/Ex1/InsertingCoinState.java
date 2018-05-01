package State.Ex1;

public class InsertingCoinState implements State {

    private CoffeeMachine coffeeMachine;

    public InsertingCoinState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;

    }
    @Override
    public void insertCoin() {
        System.out.println("Error");
    }

    @Override
    public void returnCoin() {
        System.out.println("You Money has been given back...");
        coffeeMachine.setState(coffeeMachine.getIdleState());
    }

    @Override
    public void pushButton() {
        System.out.println("Error");
    }

    @Override
    public void rightAmountEntered() {
        System.out.println("right Amount entered");
        coffeeMachine.setState(coffeeMachine.getUserChooseState());
    }

    @Override
    public void removeCup() {
        System.out.println("Error");
    }

    @Override
    public void resetButtonPushed() {
        System.out.println("Error");
    }

    @Override
    public void noCupsCoffeJamSenson() {
        System.out.println("Error");
    }

}
