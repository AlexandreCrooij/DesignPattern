package Decorator.Ex1;

public class AntiSlidingSystemDecorator extends Decorator {
    Car car;
    public AntiSlidingSystemDecorator(Car car){
        this.car = car;
    }
    @Override
    public int getSecurityLevel() {
        return car.getSecurityLevel()+1;
    }
    @Override
    public String getDescription() {

        return car.getDescription()+", AntiSliding";
    }

    @Override
    public double cost() {
        return 800 + car.cost();
    }
}
