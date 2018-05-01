package Decorator.Ex1;

public class ColorDecorator extends Decorator {
    Car car;
    public ColorDecorator(Car car){
        this.car = car;
    }
    @Override
    public int getSecurityLevel() {
        return car.getSecurityLevel()+1;
    }
    @Override
    public String getDescription() {
        return car.getDescription()+", Color";
    }

    @Override
    public double cost() {
        return 400 + car.cost();
    }
}
