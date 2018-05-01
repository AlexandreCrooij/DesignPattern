package Observer.ExerciseII;

public class DigitalTimer implements Observer {
    private MyTimer clockTimer;

    public DigitalTimer(MyTimer clockTimer){
        clockTimer.addObserver(this);
        this.clockTimer=clockTimer;
    }

    @Override
    public void update() {
        System.out.println("DigitalTimer");
        System.out.println(clockTimer.getHour()+":"+clockTimer.getMinute()+":"+clockTimer.getSecond());
    }
}
