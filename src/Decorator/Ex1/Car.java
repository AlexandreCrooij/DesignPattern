package Decorator.Ex1;

public abstract class Car {

    String description="Unknown Beverage";
    int securityLevel = 0;

    public int getSecurityLevel(){
        return securityLevel;
    }
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
