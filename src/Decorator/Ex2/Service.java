package Decorator.Ex2;

public abstract class Service {
    String description="Service Package: ";
    float price = 10; //Service Pauschale

    public abstract String getDescription();
    public abstract float getPrice();
}
