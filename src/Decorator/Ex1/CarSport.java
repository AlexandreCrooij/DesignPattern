package Decorator.Ex1;

public class CarSport extends Car {
    public CarSport(){
        description="CarSport";
        securityLevel = 1;
    }
    @Override
    public double cost() {
        return 60000;
    }

}
