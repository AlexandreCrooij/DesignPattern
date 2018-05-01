package Decorator.Ex1;

public class CarBerlin extends Car {

    public CarBerlin(){
        description = "CarBerlin";
        securityLevel = 1;
    }
    @Override
    public double cost() {
        return 40000;
    }
}
