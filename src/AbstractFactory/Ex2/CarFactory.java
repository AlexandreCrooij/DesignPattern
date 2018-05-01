package AbstractFactory.Ex2;

public interface CarFactory {
    //there is no composition?
    public Coupe createCoupe();
    public Minivan createMinivan();
    public Pickup createPickup();
}
