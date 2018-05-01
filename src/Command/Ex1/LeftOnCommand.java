package Command.Ex1;

public class LeftOnCommand implements Command {
    private Car car;

    public LeftOnCommand(Car car){
        this.car = car;
    }
    @Override
    public void execute() {
        car.goLeft();
    }

    @Override
    public void undo() {
        car.goRight();
    }
}
