package AbstractFactory.Ex2;

public class LuxuryCarsFactory implements CarFactory {
    @Override
    public Coupe createCoupe() {
        return new PorscheCayenne();
    }

    @Override
    public Minivan createMinivan() {
        return new BMWX5();
    }

    @Override
    public Pickup createPickup() {
        return new VWPickup();
    }
}
