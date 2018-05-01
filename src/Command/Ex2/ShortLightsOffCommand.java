package Command.Ex2;

public class ShortLightsOffCommand implements Command {
    private ShortLights shortLights;

    public ShortLightsOffCommand(ShortLights shortLights) {
        this.shortLights = shortLights;
    }

    @Override
    public void execute() {
        shortLights.off();
    }

    @Override
    public void undo() {
        shortLights.on();
    }
}
