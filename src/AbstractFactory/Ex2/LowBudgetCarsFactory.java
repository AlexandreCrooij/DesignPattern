package AbstractFactory.Ex2;

public class LowBudgetCarsFactory implements CarFactory {
    @Override
    public Coupe createCoupe() {
        return new VWScirocco();
    }

    @Override
    public Minivan createMinivan() {
        return new VWT3();
    }

    @Override
    public Pickup createPickup() {
        return new HyundaiPickup();
    }
}
