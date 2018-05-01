package AbstractFactory.Ex2;

public class StandartCarsFactory implements CarFactory {
    @Override
    public Coupe createCoupe() {
        return new BMWZ3();
    }

    @Override
    public Minivan createMinivan() {
        return new BMWX5() ;
    }

    @Override
    public Pickup createPickup() {
        return new NissanPickup();
    }
}
