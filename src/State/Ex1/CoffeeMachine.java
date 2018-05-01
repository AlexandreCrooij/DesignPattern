package State.Ex1;

public class CoffeeMachine implements State{
    private State idleState;
    private State insertingCoinState;
    private State makeCoffeeState;
    private State serviceNeededState;
    private State userChooseState;

    private State state;

    private int cups;
    private int coffee;

    public CoffeeMachine(int cups, int coffee) {
        idleState = new IdleState(this);
        insertingCoinState = new InsertingCoinState(this);
        makeCoffeeState = new MakeCoffeeState(this);
        serviceNeededState = new ServiceNeededState(this);
        userChooseState = new UserChooseState(this);
        this.cups = cups;
        this.coffee = coffee;
        if(cups>0&&coffee>0){
            state=idleState;
        }
        else{
            state=serviceNeededState;
        }

    }

    @Override
    public void insertCoin() {
        state.insertCoin();
    }

    @Override
    public void returnCoin() {
        state.returnCoin();
    }

    @Override
    public void pushButton() {
        state.pushButton();
    }

    @Override
    public void rightAmountEntered() {
        state.rightAmountEntered();
    }

    @Override
    public void removeCup() {
        state.removeCup();
    }

    @Override
    public void resetButtonPushed() {
        state.resetButtonPushed();
    }

    @Override
    public void noCupsCoffeJamSenson() {
        state.noCupsCoffeJamSenson();
    }

    public State getIdleState() {
        return idleState;
    }

    public void setIdleState(State idleState) {
        this.idleState = idleState;
    }

    public State getInsertingCoinState() {
        return insertingCoinState;
    }

    public void setInsertingCoinState(State insertingCoinState) {
        this.insertingCoinState = insertingCoinState;
    }

    public State getMakeCoffeeState() {
        return makeCoffeeState;
    }

    public void setMakeCoffeeState(State makeCoffeeState) {
        this.makeCoffeeState = makeCoffeeState;
    }

    public State getServiceNeededState() {
        return serviceNeededState;
    }

    public void setServiceNeededState(State serviceNeededState) {
        this.serviceNeededState = serviceNeededState;
    }

    public State getUserChooseState() {
        return userChooseState;
    }

    public void setUserChooseState(State userChooseState) {
        this.userChooseState = userChooseState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }
}
