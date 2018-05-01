package State.Ex1;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(0,20);
        coffeeMachine.insertCoin();
        coffeeMachine.rightAmountEntered();
        coffeeMachine.pushButton();
        coffeeMachine.insertCoin();
        coffeeMachine.removeCup();
        coffeeMachine.resetButtonPushed();
        coffeeMachine.insertCoin();
    }
}
