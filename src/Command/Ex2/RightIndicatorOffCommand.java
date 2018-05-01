package Command.Ex2;

public class RightIndicatorOffCommand implements Command {
    private RightIndicator rightIndicator;

    public RightIndicatorOffCommand(RightIndicator rightIndicator) {
        this.rightIndicator = rightIndicator;
    }

    @Override
    public void execute() {
        rightIndicator.off();
    }

    @Override
    public void undo() {
        rightIndicator.on();
    }
}
