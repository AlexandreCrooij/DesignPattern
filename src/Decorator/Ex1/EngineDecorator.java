package Decorator.Ex1;

public class EngineDecorator extends Decorator {
    Car car;
    public EngineDecorator(Car car){
        this.car = car;
    }

    @Override
    public int getSecurityLevel() {
        return car.getSecurityLevel()+1;
    }

    @Override
    public String getDescription() {
        return car.getDescription()+", Engine";
    }

    @Override
    public double cost() {
        return 2000 + car.cost();
    }
}
