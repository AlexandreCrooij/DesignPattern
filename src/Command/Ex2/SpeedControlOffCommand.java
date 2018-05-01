package Command.Ex2;

public class SpeedControlOffCommand implements Command {
    private SpeedControl speedControl;

    public SpeedControlOffCommand(SpeedControl speedControl) {
        this.speedControl = speedControl;
    }

    @Override
    public void execute() {
        speedControl.off();
    }

    @Override
    public void undo() {
        speedControl.on();
    }
}
