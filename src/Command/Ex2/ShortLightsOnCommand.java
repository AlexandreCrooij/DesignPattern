package Command.Ex2;

public class ShortLightsOnCommand implements Command {
    private ShortLights shortLights;

    public ShortLightsOnCommand(ShortLights shortLights) {
        this.shortLights = shortLights;
    }

    @Override
    public void execute() {
        shortLights.on();
    }

    @Override
    public void undo() {
        shortLights.off();
    }
}
