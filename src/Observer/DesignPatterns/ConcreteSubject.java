package Observer.DesignPatterns;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {
    ArrayList<Observer>myObservers = new ArrayList<Observer>();

    @java.lang.Override
    public void addObserver(Observer observer) {
        myObservers.add(observer);
    }

    @java.lang.Override
    public void removeObserver(Observer observer) {
        myObservers.remove(observer);
    }

    @java.lang.Override
    public void notifyObservers() {
        for(Observer o: myObservers){
            o.update();
        }
    }
}
