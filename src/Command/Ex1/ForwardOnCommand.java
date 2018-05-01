package Command.Ex1;

public class ForwardOnCommand implements Command {
    private Car car;

    public ForwardOnCommand(Car car){
        this.car = car;
    }
    @Override
    public void execute() {
        car.goForward();
    }

    @Override
    public void undo() {
        car.goBackward();
    }
}
