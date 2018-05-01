package Command.Ex2;

public class SpeedControlOnCommand implements Command {
    private SpeedControl speedControl;

    public SpeedControlOnCommand(SpeedControl speedControl) {
        this.speedControl = speedControl;
    }

    @Override
    public void execute() {
        speedControl.on();
    }

    @Override
    public void undo() {
        speedControl.off();
    }
}
