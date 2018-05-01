package Command.Ex2;

public class LeftIndicatorOffCommand implements Command {
    LeftIndicator leftIndicator;
    public LeftIndicatorOffCommand(LeftIndicator leftIndicator){
        this.leftIndicator=leftIndicator;
    }
    @Override
    public void execute() {
        leftIndicator.off();
    }

    @Override
    public void undo() {
        leftIndicator.on();
    }
}
