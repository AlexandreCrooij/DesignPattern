package Observer.DesignPatterns;

public class ConcreteObserver implements Observer{

    @java.lang.Override
    public void update() {
        System.out.println("Observer is observing some value");
    }
}
