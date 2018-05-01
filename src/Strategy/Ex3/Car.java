package Strategy.Ex3;

public class Car {
    private BreakingBehaviour breakingBehaviour;
    private AcceleratingBehaviour acceleratingBehaviour;

    public Car(BreakingBehaviour breakingBehaviour, AcceleratingBehaviour acceleratingBehaviour){
        this.acceleratingBehaviour = acceleratingBehaviour;
        this.breakingBehaviour = breakingBehaviour;
    }

    public void setAcceleratingBehaviour(AcceleratingBehaviour acceleratingBehaviour) {
        this.acceleratingBehaviour = acceleratingBehaviour;
    }

    public void setBreakingBehaviour(BreakingBehaviour breakingBehaviour) {
        this.breakingBehaviour = breakingBehaviour;
    }

    public void breaks(){
        breakingBehaviour.breaks();
    }

    public void accelerate(){
        acceleratingBehaviour.accelerate();
    }
}
