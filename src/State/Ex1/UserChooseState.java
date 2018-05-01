package State.Ex1;

public class UserChooseState implements State {

    private CoffeeMachine coffeeMachine;

    public UserChooseState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Error");
    }

    @Override
    public void returnCoin() {
        System.out.println("Returning the coins...");
        coffeeMachine.setState(coffeeMachine.getIdleState());
    }

    @Override
    public void pushButton() {
        System.out.println("Attempt to make Coffee...");
        coffeeMachine.setState(coffeeMachine.getMakeCoffeeState());
    }

    @Override
    public void rightAmountEntered() {
        System.out.println("Error");
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
