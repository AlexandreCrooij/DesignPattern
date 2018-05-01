package Command.Ex2;

public class LeftIndicatorOnCommand implements Command {
    LeftIndicator leftIndicator;
    public LeftIndicatorOnCommand(LeftIndicator leftIndicator){
        this.leftIndicator=leftIndicator;
    }
    @Override
    public void execute() {
        leftIndicator.on();
    }

    @Override
    public void undo() {
        leftIndicator.off();
    }
}
