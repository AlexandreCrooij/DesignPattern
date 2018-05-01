package Decorator.Ex1;
public class AirbagDecorator extends Decorator {
    Car car;
    public AirbagDecorator(Car car){
        this.car = car;
    }
    @Override
    public int getSecurityLevel() {
        return car.getSecurityLevel()+1;
    }
    @Override
    public String getDescription() {
        return car.getDescription()+", Airbag";
    }

    @Override
    public double cost() {
        return 350 + car.cost();
    }
}
