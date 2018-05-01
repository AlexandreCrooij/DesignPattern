package Decorator.Ex1;

public abstract class Decorator extends Car {
    @Override
    public abstract String getDescription();

    @Override
    public abstract int getSecurityLevel();
}
