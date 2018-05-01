package Command.Ex2;

public class ClutchOnCommand implements Command {
    private Clutch clutch;

    public ClutchOnCommand(Clutch clutch){
        this.clutch=clutch;
    }
    @Override
    public void execute() {
        clutch.on();
    }

    @Override
    public void undo() {
        clutch.off();
    }
}
