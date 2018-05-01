package Command.Ex1;

public class RightOnCommand implements Command {
    private Car car;

    public RightOnCommand(Car car){
        this.car = car;
    }
    @Override
    public void execute() {
        car.goRight();
    }

    @Override
    public void undo() {
        car.goLeft();
    }
}
