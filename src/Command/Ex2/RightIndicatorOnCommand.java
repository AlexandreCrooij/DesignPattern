package Command.Ex2;

public class RightIndicatorOnCommand implements Command {
    private RightIndicator rightIndicator;

    public RightIndicatorOnCommand(RightIndicator rightIndicator) {
        this.rightIndicator = rightIndicator;
    }

    @Override
    public void execute() {
        rightIndicator.on();
    }

    @Override
    public void undo() {
        rightIndicator.off();
    }
}
