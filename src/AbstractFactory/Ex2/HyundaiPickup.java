package AbstractFactory.Ex2;

public class HyundaiPickup implements Pickup {
    @Override
    public String getName() {
        return "Hyundai Pickup";
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
