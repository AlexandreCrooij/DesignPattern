package Command.Ex2;

public class ClutchOffCommand implements Command {
    private Clutch clutch;

    public ClutchOffCommand(Clutch clutch){
        this.clutch=clutch;
    }
    @Override
    public void execute() {
        clutch.off();
    }

    @Override
    public void undo() {
        clutch.on();
    }
}
