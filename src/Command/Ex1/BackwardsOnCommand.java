package Command.Ex1;

public class BackwardsOnCommand implements Command {

    private Car car;

    public BackwardsOnCommand(Car car){
        this.car = car;
    }
    @Override
    public void execute() {
        car.goBackward();
    }

    @Override
    public void undo() {
        car.goForward();
    }
}
