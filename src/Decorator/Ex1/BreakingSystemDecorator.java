package Decorator.Ex1;

public class BreakingSystemDecorator extends Decorator {
    Car car;
    public BreakingSystemDecorator(Car car){
        this.car = car;
    }
    @Override
    public int getSecurityLevel() {
        return car.getSecurityLevel()+1;
    }
    @Override
    public String getDescription() {
        return car.getDescription()+", Breaks";
    }

    @Override
    public double cost() { return 1300 + car.cost();
    }
}
