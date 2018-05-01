package Observer.ExerciseII;

import java.util.ArrayList;
import java.util.Calendar; import java.util.Timer; import java.util.TimerTask;

public class MyTimer implements ClockTimer, Subject {
    ArrayList<Observer> myObservers=new ArrayList<Observer>();
    private Calendar cal;
    private Timer timer;

    /**
     * Constructor
     */
    public MyTimer() {
        cal = Calendar.getInstance();
        timer = new Timer();
        timer.schedule(new TimerAction(), 0, 1 * 1000);
    }

    class TimerAction extends TimerTask {
        public void run() {
            cal = Calendar.getInstance();
            tick();

        }
    }

    @Override
    public void addObserver(Observer observer) {
        myObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i=myObservers.indexOf(observer);
        if(i>=0) {
            myObservers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer o : myObservers){
            o.update();
        }
    }

    public int getHour() {
        return cal.get(Calendar.HOUR_OF_DAY);
    }

    public int getMinute() {
        return cal.get(Calendar.MINUTE);
    }

    public int getSecond() {
        return cal.get(Calendar.SECOND);
    }

    public void tick() {
        notifyObservers();
    }
}