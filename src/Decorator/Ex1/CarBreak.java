package Decorator.Ex1;

public class CarBreak extends Car {
    public CarBreak(){
        description = "CarBreak";
        securityLevel = 1;
    }
    @Override
    public double cost() {
        return 45000;
    }
}
