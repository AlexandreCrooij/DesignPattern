package Command.Ex2;

public class RemoteLoader {
    public static void main(String[] args) {
        Car car = new Car();
        Clutch clutch = new Clutch();
        Breaks breaks = new Breaks();
        LeftIndicator leftIndicator = new LeftIndicator();
        RightIndicator rightIndicator = new RightIndicator();
        ShortLights shortLights = new ShortLights();
        LongLights longLights = new LongLights();
        SpeedControl speedControl = new SpeedControl();

        LeftIndicatorOffCommand leftIndicatorOffCommand = new LeftIndicatorOffCommand(leftIndicator);
        LeftIndicatorOnCommand leftIndicatorOnCommand = new LeftIndicatorOnCommand(leftIndicator);
        RightIndicatorOffCommand rightIndicatorOffCommand = new RightIndicatorOffCommand(rightIndicator);
        RightIndicatorOnCommand rightIndicatorOnCommand = new RightIndicatorOnCommand(rightIndicator);
        ClutchOffCommand clutchOffCommand = new ClutchOffCommand(clutch);
        ClutchOnCommand clutchOnCommand = new ClutchOnCommand(clutch);
        ShortLightsOffCommand shortLightsOffCommand = new ShortLightsOffCommand(shortLights);
        ShortLightsOnCommand shortLightsOnCommand = new ShortLightsOnCommand(shortLights);
        LongLightsOffCommand longLightsOffCommand = new LongLightsOffCommand(longLights);
        LongLightsOnCommand longLightsOnCommand = new LongLightsOnCommand(longLights);
        BreaksOnCommand breaksOnCommand = new BreaksOnCommand(breaks);
        BreaksOffCommand breaksOffCommand = new BreaksOffCommand(breaks);
        SpeedControlOffCommand speedControlOffCommand = new SpeedControlOffCommand(speedControl);
        SpeedControlOnCommand speedControlOnCommand = new SpeedControlOnCommand(speedControl);

        car.setCommand(0, leftIndicatorOnCommand, leftIndicatorOffCommand);
        car.setCommand(1, rightIndicatorOnCommand, rightIndicatorOffCommand);
        car.setCommand(2, speedControlOnCommand, speedControlOffCommand);
        car.setCommand(3, rightIndicatorOnCommand, rightIndicatorOffCommand);
        car.setCommand(4, clutchOnCommand, clutchOffCommand);
        car.setCommand(5, shortLightsOnCommand, shortLightsOffCommand);
        car.setCommand(6, longLightsOnCommand, longLightsOffCommand);

        car.onButtonWasPushed(0);
        car.onButtonWasPushed(1);
        car.onButtonWasPushed(2);
        car.onButtonWasPushed(3);
        car.onButtonWasPushed(4);
        car.onButtonWasPushed(5);
        car.onButtonWasPushed(6);
        car.offButtonWasPushed(0);
        car.offButtonWasPushed(1);
        car.offButtonWasPushed(2);
        car.offButtonWasPushed(3);
        car.offButtonWasPushed(4);
        car.offButtonWasPushed(5);
        car.offButtonWasPushed(6);
        car.undoButtonWasPushed();
        car.undoButtonWasPushed();
        car.undoButtonWasPushed();
        car.undoButtonWasPushed();
        car.undoButtonWasPushed();
        car.undoButtonWasPushed();
        car.undoButtonWasPushed();
        car.undoButtonWasPushed();
        car.undoButtonWasPushed();
        car.undoButtonWasPushed();
        car.undoButtonWasPushed();
        car.undoButtonWasPushed();
        car.undoButtonWasPushed();
        car.undoButtonWasPushed();










    }
}
