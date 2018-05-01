package Command.Ex2;

public class BreaksOnCommand implements Command {
    private Breaks breaks;

    public BreaksOnCommand(Breaks breaks){
        this.breaks=breaks;
    }
    @Override
    public void execute() {
        breaks.on();
    }

    @Override
    public void undo() {
        breaks.off();
    }
}
