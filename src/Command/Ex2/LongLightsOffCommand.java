package Command.Ex2;

public class LongLightsOffCommand implements Command {
    private LongLights longLights;

    public LongLightsOffCommand(LongLights longLights){
        this.longLights=longLights;
    }
    @Override
    public void execute() {
        longLights.off();
    }

    @Override
    public void undo() {
        longLights.on();
    }
}
