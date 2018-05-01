package State.Ex1;

public class ServiceNeededState implements State {

    private CoffeeMachine coffeeMachine;

    public ServiceNeededState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Error");
    }

    @Override
    public void returnCoin() {
        System.out.println("Error");
    }

    @Override
    public void pushButton() {
        System.out.println("Error");
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
        System.out.println("Reset Button pushed");
        coffeeMachine.setState(coffeeMachine.getIdleState());
        coffeeMachine.setCoffee(coffeeMachine.getCoffee()+10);
        coffeeMachine.setCups(coffeeMachine.getCups()+10);
    }

    @Override
    public void noCupsCoffeJamSenson() {
        System.out.println("Error");
    }
}
