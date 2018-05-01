package Command.Ex2;

public class BreaksOffCommand implements Command {
    private Breaks breaks;

    public BreaksOffCommand(Breaks breaks){
        this.breaks=breaks;
    }
    @Override
    public void execute() {
        breaks.off();
    }

    @Override
    public void undo() {
        breaks.on();
    }
}
