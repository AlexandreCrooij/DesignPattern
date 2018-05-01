package Command.Ex2;

public class LongLightsOnCommand implements Command {
    private LongLights longLights;

    public LongLightsOnCommand(LongLights longLights){
        this.longLights=longLights;
    }
    @Override
    public void execute() {
        longLights.on();
    }

    @Override
    public void undo() {
        longLights.off();
    }
}
