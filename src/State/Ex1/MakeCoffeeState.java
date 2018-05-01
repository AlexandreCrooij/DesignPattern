package State.Ex1;

public class MakeCoffeeState implements State {

    private CoffeeMachine coffeeMachine;

    public MakeCoffeeState(CoffeeMachine coffeeMachine) {
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
        if(coffeeMachine.getCups()==0&&coffeeMachine.getCoffee()==0){
            removeCup();
        }
        else {
            System.out.println("Attempt to make coffee successfull. Cup removed...");
            coffeeMachine.setState(coffeeMachine.getIdleState());
        }

    }

    @Override
    public void resetButtonPushed() {
        System.out.println("Error");
    }

    @Override
    public void noCupsCoffeJamSenson() {
        if(coffeeMachine.getCups()>0&&coffeeMachine.getCoffee()>0){
            removeCup();
        }
        else {
            System.out.println("Lacking Coffee or Cups");
            coffeeMachine.setState(coffeeMachine.getServiceNeededState());
        }
    }

}
