package AbstractFactory.Ex2;

public class NissanPickup implements Pickup {
    @Override
    public String getName() {
        return "Nissan Pickup";
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
