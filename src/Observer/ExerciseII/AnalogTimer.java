package Observer.ExerciseII;

public class AnalogTimer implements Observer {
    MyTimer clockTimer;

    public AnalogTimer(MyTimer clockTimer){
        clockTimer.addObserver(this);
        this.clockTimer=clockTimer;
    }

    @Override
    public void update() {
        System.out.println("AnalogTimer");
        System.out.println(clockTimer.getHour()+"H"+"\n"+clockTimer.getMinute()+"M\n"+clockTimer.getSecond()+"S");
    }
}
